package com.example.tourismapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    RecyclerView recyclerView;
    RecyclerView recyclerView2;

    ArrayList<location> locations;
    ArrayList<second> seconds;

    LocaAdapter locaAdapter;
    SecondAdapter secondAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            recyclerView = findViewById(R.id.recycler_view);
            recyclerView2 = findViewById(R.id.recycler_view2);

            Integer[] locaImage = {R.drawable.federationsquare, R.drawable.royalbotanicgardens, R.drawable.nationalsportmuseum,
                    R.drawable.artcentre, R.drawable.nationalgallery, R.drawable.eurekatower};

            String[] locaName = {"Federation Square", "Royal Botanic Gardens", "National Sports Museum",
                    "Arts Centre Melbourne", "National Gallery of Victoria", " Eureka Tower",
            };

            Integer[] locaImage2 = {R.drawable.federationsquare, R.drawable.royalbotanicgardens, R.drawable.nationalsportmuseum,
                    R.drawable.artcentre, R.drawable.nationalgallery, R.drawable.eurekatower, R.drawable.arcadesandlaneways,
                    R.drawable.melbournemuseum, R.drawable.citycircletram, R.drawable.melbournezoo};

            String[] locaName2 = {"Federation Square", "Royal Botanic Gardens", "National Sports Museum",
                    "Arts Centre Melbourne", "National Gallery of Victoria", " Eureka Tower",
                    "Arcades and Laneways", "Royal Exhibition Building", "City Circle Tram Tour", "Melbourne Zoo"};
            String[] locat = {"Location: Corner Swanston and Flinders Streets, Melbourne", "Location: Birdwood Ave, South Yarra", "Location: Brunton Ave, East Melbourne",
                    "Location: St. Kilda Road, Melbourne", "Location: St. Kilda Road, Melbourne and Federation Square", "Location: 7 Riverside Quay, Southbank"
                    , "Location:335 Bourke St, Melbourne VIC 3000", "Location: 11 Nicholson Street, Carlton", "Location: Flinder stations front gate", "Location: Elliott Ave, Parkville"
            };


            locations = new ArrayList<>();
            for (int i = 0; i < locaImage.length; i++) {
                location locate = new location(locaImage[i], locaName[i]);
                locations.add(locate);
            }
            seconds = new ArrayList<>();
            for (int i = 0; i < locaImage2.length; i++) {
                second m = new second(locaImage2[i], locaName2[i], locat[i]);
                seconds.add(m);
            }


            recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            locaAdapter = new LocaAdapter(MainActivity.this, locations);
            recyclerView.setAdapter(locaAdapter);


            recyclerView2.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
            recyclerView2.setItemAnimator(new DefaultItemAnimator());
            secondAdapter = new SecondAdapter(MainActivity.this, seconds);
            recyclerView2.setAdapter(secondAdapter);



        

    }


}