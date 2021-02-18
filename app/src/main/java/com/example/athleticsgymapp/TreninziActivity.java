package com.example.athleticsgymapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TreninziActivity extends AppCompatActivity {

    private RecyclerView listaTreninga;
    private ListaTreningaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treninzi);

        adapter= new ListaTreningaAdapter(this);
        listaTreninga = findViewById(R.id.listaTreninga);

        listaTreninga.setAdapter(adapter);
        listaTreninga.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<Trening> treninzi = new ArrayList<>();
        treninzi.add(new Trening("Trening za ruke","Nanana","Dobro","https://upload.wikimedia.org/wikipedia/commons/6/6a/Basketball_%28Ball%29.jpg"));
        adapter.setTreninzi(treninzi);

    }
}