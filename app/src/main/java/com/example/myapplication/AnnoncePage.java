package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AnnoncePage extends AppCompatActivity {

    RecyclerView recyclerView;

    String objectReturn[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annonce_page);

        recyclerView = findViewById(R.id.recyclerView);

        objectReturn = getResources().getStringArray(R.array.annonce_list);

        Adapter adapter = new Adapter(this,objectReturn);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}