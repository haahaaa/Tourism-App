package com.example.tourismapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.VH> {
    ArrayList<second> seconds;
    Context context2;

    public SecondAdapter(Context context2, ArrayList<second> seconds){
        this.context2 = context2;
        this.seconds = seconds;

    }

    @NonNull
    @Override
    public SecondAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item2,parent,false);

        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SecondAdapter.VH holder, int position) {
        holder.imageView2.setImageResource(seconds.get(position).getLocaimage());
        holder.textView1.setText(seconds.get(position).getLocaName());
        holder.textView2.setText(seconds.get(position).getLocat());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (position == 0) {

                   AppCompatActivity activity1 = (AppCompatActivity) v.getContext();
                   firstFragment first = new firstFragment();
                   activity1.getSupportFragmentManager().beginTransaction().replace(R.id.rec, first)
                           .addToBackStack(null).commit();
               }
               else if(position == 1) {
                   AppCompatActivity activity2 = (AppCompatActivity) v.getContext();
                   secondFragment second = new secondFragment();
                   activity2.getSupportFragmentManager().beginTransaction().replace(R.id.rec, second)
                           .addToBackStack(null).commit();
               }
               else if(position == 2){
                   AppCompatActivity activity3 = (AppCompatActivity) v.getContext();
                   thirdFragment third = new thirdFragment();
                   activity3.getSupportFragmentManager().beginTransaction().replace(R.id.rec, third)
                           .addToBackStack(null).commit();
               }
               else if(position == 3){
                   AppCompatActivity activity4 = (AppCompatActivity) v.getContext();
                   fourFragment four = new fourFragment();
                   activity4.getSupportFragmentManager().beginTransaction().replace(R.id.rec, four)
                           .addToBackStack(null).commit();
               }
               else if(position == 4){
                   AppCompatActivity activity5 = (AppCompatActivity) v.getContext();
                   fiveFragment five = new fiveFragment();
                   activity5.getSupportFragmentManager().beginTransaction().replace(R.id.rec, five)
                           .addToBackStack(null).commit();
               }
               else if(position == 5){
                   AppCompatActivity activity6 = (AppCompatActivity) v.getContext();
                   sixFragment six = new sixFragment();
                   activity6.getSupportFragmentManager().beginTransaction().replace(R.id.rec, six)
                           .addToBackStack(null).commit();
               }
               else if(position == 6){
                   AppCompatActivity activity7 = (AppCompatActivity) v.getContext();
                   sevenFragment seven = new sevenFragment();
                   activity7.getSupportFragmentManager().beginTransaction().replace(R.id.rec, seven)
                           .addToBackStack(null).commit();
               }
               else if(position == 7){
                   AppCompatActivity activity8 = (AppCompatActivity) v.getContext();
                   eightFragment eight = new eightFragment();
                   activity8.getSupportFragmentManager().beginTransaction().replace(R.id.rec, eight)
                           .addToBackStack(null).commit();
               }
               else if(position == 8){
                   AppCompatActivity activity9 = (AppCompatActivity) v.getContext();
                   nineFragment nine = new nineFragment();
                   activity9.getSupportFragmentManager().beginTransaction().replace(R.id.rec, nine)
                           .addToBackStack(null).commit();
               }
               else if(position == 9){
                   AppCompatActivity activity10 = (AppCompatActivity) v.getContext();
                   tenFragment ten = new tenFragment();
                   activity10.getSupportFragmentManager().beginTransaction().replace(R.id.rec, ten)
                           .addToBackStack(null).commit();
               }
            }
        });


    }

    @Override
    public int getItemCount() {
        return seconds.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        ImageView imageView2;
        TextView textView1;
        TextView textView2;
        LinearLayout linearLayout;
        public VH(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.image_view2);
            textView1 = itemView.findViewById(R.id.text_view1);
            textView2 = itemView.findViewById(R.id.text_view2);
            linearLayout = itemView.findViewById(R.id.linearlayout);
        }
    }


}
