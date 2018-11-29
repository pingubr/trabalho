package com.example.brunab.projeto.Telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brunab.projeto.R;

public class Veiculos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veiculos);
    }
    public void novo (View view){
        Intent it = new Intent(Veiculos.this, Cadastro_Veiculos.class);
        startActivity(it);
    }
}
