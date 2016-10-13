package com.technawabs.adiportfolio;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortflioActivity extends AppCompatActivity {

    private Button popularMovies;
    private Button stockHawk;
    private Button buildItBigger;
    private Button makeAppMaterial;
    private Button goUbiquitous;
    private Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portflio);

        popularMovies = (Button) findViewById(R.id.openPopularMovie);
        stockHawk = (Button) findViewById(R.id.openStockHawk);
        buildItBigger = (Button) findViewById(R.id.openBuildItBigger);
        makeAppMaterial = (Button) findViewById(R.id.openMaterialApp);
        goUbiquitous = (Button) findViewById(R.id.openGoUbiquitous);
        capstone = (Button) findViewById(R.id.openCapstone);

        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage("Popular Movies");
            }
        });
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage("Stock Hawk");
            }
        });
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage("Build It Bigger");
            }
        });
        makeAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage("Make App Material");
            }
        });
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage("Go Ubiquitous");
            }
        });
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage("Capstone");
            }
        });
    }

    private void showToastMessage(@NonNull String message) {
        Toast.makeText(getApplicationContext(), "This button will launch my " + message + " app", Toast.LENGTH_SHORT).show();
    }
}
