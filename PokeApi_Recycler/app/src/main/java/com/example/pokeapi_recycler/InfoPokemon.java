package com.example.pokeapi_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class InfoPokemon extends AppCompatActivity {
    TextView nombrePoke;
    List<ImgPoke> listado;
    List<HabilidadPoke> listado_habilidad;

    AdaptadorImgPoke adaptador;

    AdaptadorHabilidad adaptadorHabilidad;

    RecyclerView recyclerView;

    RecyclerView recyclerHabilidad;

    TextView altura_view;
    TextView peso_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pokemon);
        nombrePoke=findViewById(R.id.nombrePokemon);
        recyclerView=findViewById(R.id.recycler_img);
        recyclerHabilidad=findViewById(R.id.recycler_habilidad);
        altura_view=findViewById(R.id.altura);
        peso_view=findViewById(R.id.peso);
        Intent intencion= getIntent();
        String urlPokemon= intencion.getStringExtra("urlPokemon");
        System.out.println("url: "+urlPokemon);

        cargarInfoPokemon(urlPokemon);
        cargarHabilidadPokemon(urlPokemon);
        cargar_img(urlPokemon);
    }

    public void cargarInfoPokemon(String urlPokemon){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = urlPokemon;

        JsonObjectRequest solicitud = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    System.out.println(response.toString());
                    System.out.println("El servidor POST responde OK");

                    JSONArray lista_pokemones = response.getJSONArray("forms");

                   // listado= new ArrayList<>();
                    for (int i = 0; i < lista_pokemones.length(); i++) {
                        JSONObject pokemon = lista_pokemones.getJSONObject(i);

                        String nombre = pokemon.getString("name");

                        nombrePoke.setText(nombre);
                        System.out.println("Nombre: " + nombre);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    System.out.println("Error al procesar la respuesta JSON:");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }
    public void cargar_img(String urlPokemon){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = urlPokemon;

        JsonObjectRequest solicitud = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    System.out.println(response.toString());
                    System.out.println("El servidor POST responde OK");

                    JSONObject img = response.getJSONObject("sprites");


                    int altura_js = response.getInt("height");
                    int peso_js = response.getInt("weight");

                    String altura = String.valueOf(altura_js);
                    String peso = String.valueOf(peso_js);


                    listado= new ArrayList<>();

                    String de_espalda = img.getString("back_default");
                    String de_frente = img.getString("front_default");
                    String de_color= img.getString("back_shiny");
                    String de_color2= img.getString("front_shiny");
                    altura_view.setText(altura);
                    peso_view.setText(peso);
                    System.out.println("Img_de espalda : " + de_espalda);
                    System.out.println("Img de frente: " + de_frente);
                    System.out.println("aLTUTA: " + altura);
                    System.out.println("peso: " + peso);


                    listado.add(new ImgPoke(de_frente));
                    listado.add(new ImgPoke(de_espalda));
                    listado.add(new ImgPoke(de_color));
                    listado.add(new ImgPoke(de_color2));
                    adaptador= new AdaptadorImgPoke(listado);
                    recyclerView.setAdapter(adaptador);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));


                } catch (JSONException e) {
                    e.printStackTrace();
                    System.out.println("Error al procesar la respuesta JSON:");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }

    public void cargarHabilidadPokemon(String urlPokemon){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = urlPokemon;

        JsonObjectRequest solicitud = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    System.out.println(response.toString());
                    System.out.println("El servidor POST responde OK");

                    JSONArray lista_pokemones = response.getJSONArray("abilities");

                    listado_habilidad= new ArrayList<>();
                    for (int i = 0; i < lista_pokemones.length(); i++) {
                        JSONObject pokemon = lista_pokemones.getJSONObject(i);
                        JSONObject habilidad = pokemon.getJSONObject("ability");
                        String nombre_habilidad = habilidad.getString("name");

                        listado_habilidad.add(new HabilidadPoke(nombre_habilidad));
                        adaptadorHabilidad= new AdaptadorHabilidad(listado_habilidad);
                        recyclerHabilidad.setAdapter(adaptadorHabilidad);
                        recyclerHabilidad.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



                        System.out.println("Habilidad: " + nombre_habilidad);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    System.out.println("Error al procesar la respuesta JSON:");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }
}