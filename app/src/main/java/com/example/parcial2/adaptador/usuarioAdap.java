package com.example.parcial2.adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial2.R;
import com.example.parcial2.clases.USERS;

import java.util.List;

public class usuarioAdap extends RecyclerView.Adapter<usuarioAdap.ViewHolder> {

    private List<USERS> datos;
    public  usuarioAdap(List<USERS> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public usuarioAdap.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaptador, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull usuarioAdap.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_user2, txt_user3;
        ImageView img_user;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_user2 = itemView.findViewById(R.id.txt_user2);
            txt_user3 = itemView.findViewById(R.id.txt_user3);
            img_user = itemView.findViewById(R.id.img_user);
        }
    }
}
