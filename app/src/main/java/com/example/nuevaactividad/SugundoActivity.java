package com.example.nuevaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SugundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugundo);
    }

    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}