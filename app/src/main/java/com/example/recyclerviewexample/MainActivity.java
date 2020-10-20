package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Burger","This is a burger",R.drawable.burger),
                new MyMovieData("Cupcake","This is a cupcake",R.drawable.cupcake),
                new MyMovieData("Icecream","This is an icecreak",R.drawable.icecream),
                new MyMovieData("Fries","This is french fries",R.drawable.fries),
                new MyMovieData(" Cupcake","This is cupcake",R.drawable.cupcake),
                new MyMovieData("Pizza","This is pizza",R.drawable.pizza),
                new MyMovieData("French Fries","This is french fries",R.drawable.fries),
        };

        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);

    }
}
