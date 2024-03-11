package com.example.androidpreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.androidpreguntas.utils.Config;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmpezarCuestionario extends AppCompatActivity {

    Config config;

    TextView nombre, fecha;
    LinearLayout preguntas_opciones;
    Button recrear;
    String id_cuestionario;
    public String ultimaSeleccion;
    public String id_opcion_seleccionada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empezar_cuestionario);
        nombre=findViewById(R.id.nombre);
        fecha=findViewById(R.id.fecha);
        preguntas_opciones=findViewById(R.id.mostrar_pregunta);
        config = new Config(getApplicationContext());

        SharedPreferences archivo =  getSharedPreferences("app_pregunta_v3", MODE_PRIVATE);
        String nombres= archivo.getString("nombres","");
        String id_usuarios= archivo.getString("id_usuario","");

        SimpleDateFormat simple= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String hora= simple.format(new Date());

        nombre.setText(nombres);
        fecha.setText("Nuevo: "+hora);

        Intent intencion= getIntent();
        String id_cuestionario =intencion.getStringExtra("id_cuestionario");

         recrear = findViewById(R.id.recrear_pregunta);

        mostrar_preguntas(id_cuestionario);

    }


    public void mostrar_preguntas(String id_cuestionario){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas-V1/MostrarPreguntas.php");
        System.out.println("url: "+url);

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println(response);
                try {

                    JsonObject lista = JsonParser.parseString(response).getAsJsonObject();
                    JsonObject preguntaObject = lista.getAsJsonObject("pregunta");
                    System.out.println(preguntaObject);

                    TextView preguntas=new TextView(getApplicationContext());

                    JsonArray lista_opciones = preguntaObject.getAsJsonArray("opciones");
                    TextView[] opciones = new TextView[lista_opciones.size()];
                    CheckBox[] check = new CheckBox[lista_opciones.size()];

                    String id= preguntaObject.get("id").getAsString();
                    String descripcion= preguntaObject.get("descripcion").getAsString();
                    String id_correcta= preguntaObject.get("id_correcta").getAsString();
                    System.out.println("esta es la id correcta: "+id_correcta);

                    String urlImagen = preguntaObject.get("url_imagen").getAsString();
                    ImageView imageView = new ImageView(getApplicationContext());
                    imageView.setLayoutParams(new ViewGroup.LayoutParams(400, 400));
                    Picasso.get().load(urlImagen).into(imageView);

                    preguntas.append("Pregunta: "+id+"\n");
                    preguntas.append(descripcion+"\n");

                    preguntas.setTextColor(Color.parseColor("#FFFFFF"));

                    System.out.println("oda"+descripcion);
                    System.out.println("id_pregun:"+id);
                    preguntas_opciones.addView(preguntas);
                    preguntas_opciones.addView(imageView);
                    RadioGroup radioGroup = new RadioGroup(getApplicationContext());
                    RadioButton[] radioButton = new RadioButton[lista_opciones.size()];
                    for (int j=0; j<lista_opciones.size(); j++){
                      opciones[j]= new TextView(getApplicationContext());
                       JsonObject temporal_opciones=lista_opciones.get(j).getAsJsonObject();
                        String descripcion_opciones= temporal_opciones.get("descripcion").getAsString();
                        String id_opcion= temporal_opciones.get("id").getAsString();
                        int id_opcion_int = Integer.parseInt(id_opcion);
                        System.out.println("esta es la id de la api: "+id_opcion);
                        System.out.println("esta es la de la iteradora: "+j);

                        radioButton[j] = new RadioButton(getApplicationContext());
                        radioButton[j].setText(descripcion_opciones);
                        radioButton[j].setTextColor(Color.parseColor("#FFFFFF"));
                        radioButton[j].setTag(descripcion_opciones);


                        // Configurar el ID del RadioButton
                        radioButton[j].setId(id_opcion_int);

                        // Agregar el RadioButton al RadioGroup
                        radioGroup.addView(radioButton[j]);
                    }
                    ultimaSeleccion = null;
                    id_opcion_seleccionada=null;
                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {

                            RadioButton selectedRadioButton = findViewById(checkedId);

                            if (selectedRadioButton != null) {
                                id_opcion_seleccionada = String.valueOf(selectedRadioButton.getId());
                                ultimaSeleccion = selectedRadioButton.getTag().toString();
                                System.out.println("esta es la opcion seleccionada: "+id_opcion_seleccionada);
                                System.out.println("esta es la descripcion de la seleccionada: "+ultimaSeleccion);


                            }
                        }
                    });
                    String ok = "OK";
                    String error = "ERROR";
                    recrear.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(ultimaSeleccion != null){
                                if (id_opcion_seleccionada != null  && id_opcion_seleccionada.equals(id_correcta)) {
                                    insertarRespuestas(id_cuestionario, id, ultimaSeleccion, ok);
                                    //int numero = Integer.parseInt(id_cuestionario);
                                    actualizarCuestionario( id_cuestionario, 1, 1, 0);
                                    recreate();
                                } else {
                                    insertarRespuestas(id_cuestionario, id, ultimaSeleccion, error);
                                    actualizarCuestionario( id_cuestionario, 1, 0, 1);
                                    recreate();
                                }
                            }

                        }
                    });




                    preguntas_opciones.addView(radioGroup);



                    System.out.println(response);
                    System.out.println("El servidor POST responde OK");



                } catch (Exception e) {
                    System.out.println("El servidor POST responde con un error:");
                    e.printStackTrace();

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());

            }
        }){

            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_cuestionario", id_cuestionario);


                return params;
            }
        };

        queue.add(solicitud);
    }


    public void insertarRespuestas(String id_cuestionario, String id_pregunta, String respuesta, String estado){

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas-V1/InsertarRespuestas.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);


                    System.out.println(response);
                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<>();
                params.put("id_cuestionario", id_cuestionario);
                params.put("id_pregunta", id_pregunta);
                params.put("respuesta", respuesta);
                params.put("estado", estado);


                return params;
            }
        };

        queue.add(solicitud);
    }
    public void actualizarCuestionario(String id_cuestionario, int cant_preguntas, int cant_ok, int cant_error){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas-V1/actualizarCuestionario.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);


                    System.out.println(response);
                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("id_cuestionario", id_cuestionario);
                params.put("cant_preguntas", String.valueOf(cant_preguntas));
                params.put("cant_ok", String.valueOf(cant_ok));
                params.put("cant_error", String.valueOf(cant_error));

                return params;
            }
        };

        queue.add(solicitud);
    }

}