package com.example.nuevaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo del Boton Activity
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, SugundoActivity.class);
        startActivity(siguiente);
    }
}