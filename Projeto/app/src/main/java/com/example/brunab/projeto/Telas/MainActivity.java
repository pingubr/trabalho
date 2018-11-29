package com.example.brunab.projeto.Telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brunab.projeto.Entidade.Funcionario;
import com.example.brunab.projeto.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Clientes (View view){
        Intent it = new Intent(MainActivity.this, Clientes.class);
        startActivity(it);
    }


    public void Funcionarios (View view){
        Intent it = new Intent(MainActivity.this, Funcionarios.class);
        startActivity(it);
    }


    public void Veiculos (View view){
        Intent it = new Intent(MainActivity.this, Veiculos.class);
        startActivity(it);
    }
}
