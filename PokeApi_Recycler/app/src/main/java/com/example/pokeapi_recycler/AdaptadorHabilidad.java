package com.example.pokeapi_recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorHabilidad extends RecyclerView.Adapter<AdaptadorHabilidad.ViewHolder>{
    List<HabilidadPoke> listaPokemones;
    public AdaptadorHabilidad(List<HabilidadPoke> listaPokemones) {
        this.listaPokemones = listaPokemones;


    }

    @NonNull
    @Override
    public AdaptadorHabilidad.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_habilidades, parent, false);
        return new AdaptadorHabilidad.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHabilidad.ViewHolder holder, int position) {
        HabilidadPoke temporal= listaPokemones.get(position);
        holder.cargarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return listaPokemones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        Context contexto;


        TextView habilidad;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contexto= itemView.getContext();
            habilidad=itemView.findViewById(R.id.habilidad);
        }

        public void cargarDatos(HabilidadPoke datos){
            habilidad.setText(datos.getHabilidad());

        }
    }
}
