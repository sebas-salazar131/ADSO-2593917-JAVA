package com.example.androidpreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.androidpreguntas.utils.Config;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class NuevoCuestionario extends AppCompatActivity {
    Config config;
    TextView nombre, fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_cuestionario);
        nombre= findViewById(R.id.nombre);
        fecha= findViewById(R.id.fecha);
        config= new Config(getApplicationContext());

        SharedPreferences archivo =  getSharedPreferences("app_pregunta_v3", MODE_PRIVATE);
        String nombres= archivo.getString("nombres","");


        SimpleDateFormat simple= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String hora= simple.format(new Date());
        System.out.println(nombres);
        nombre.setText(nombres);
        fecha.setText(hora);

    }

    public void empezarCuestionario(View vista){
        SharedPreferences archivo = getSharedPreferences("app_pregunta_v3", MODE_PRIVATE);
        String id_usuarios= archivo.getString("id_usuario","");
        insertarCuestionario(id_usuarios);

    }
    public void insertarCuestionario(String id_usuarios){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas-V1/InsertarCuestionario.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    JsonObject lista = JsonParser.parseString(response).getAsJsonObject();
                    String id_cuestionario = lista.get("registros").getAsString();
                    System.out.println("El cuestionario es: " + id_cuestionario);


                    Intent intencion = new Intent(NuevoCuestionario.this, EmpezarCuestionario.class);
                    intencion.putExtra("id_cuestionario", id_cuestionario);
                    startActivity(intencion);

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
                params.put("id_usuarios", id_usuarios);


                return params;
            }
        };

        queue.add(solicitud);
    }

}