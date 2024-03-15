package com.example.pokeapi_recycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorImgPoke extends RecyclerView.Adapter<AdaptadorImgPoke.ViewHolder>{
    List<ImgPoke> listaPokemones;
    public AdaptadorImgPoke(List<ImgPoke> listaPokemones) {
        this.listaPokemones = listaPokemones;


    }

    @NonNull
    @Override
    public AdaptadorImgPoke.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_img_pokemon, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorImgPoke.ViewHolder holder, int position) {
        ImgPoke temporal= listaPokemones.get(position);
        holder.cargarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return listaPokemones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        Context contexto;

        FrameLayout imgPoke;

        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contexto= itemView.getContext();
            imgPoke=itemView.findViewById(R.id.imgPokemon);
        }

        public void cargarDatos(ImgPoke datos){
            String img=datos.getImg();

            imageView = new ImageView(contexto);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            Picasso.get().load(img).into(imageView);

            // Agrega la ImageView al FrameLayout
            imgPoke.addView(imageView);
        }
    }

}