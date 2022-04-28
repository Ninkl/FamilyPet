package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void annonceView(View v) {
        Intent AnnoncePage = new Intent(this, AnnoncePage.class);
        startActivity(AnnoncePage);
    }


    public void webService(View v) {
        Intent WebServiceApp = new Intent(this, WebServiceApp.class);
        startActivity(WebServiceApp);
    }
}