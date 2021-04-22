package com.example.tourismapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LocaAdapter extends RecyclerView.Adapter<LocaAdapter.ViewHolder>{

    ArrayList<location> locations;
    Context context;

    public LocaAdapter(Context context, ArrayList<location> locations){
        this.context = context;
        this.locations = locations;
    }


    @NonNull
    @Override
    public LocaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocaAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(locations.get(position).getLocaimage());
        holder.textView.setText(locations.get(position).getLocaName());



    }

    @Override
    public int getItemCount() {
        return locations.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.text_view);

        }
    }
}
