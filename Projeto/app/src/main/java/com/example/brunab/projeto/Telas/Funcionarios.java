package com.example.brunab.projeto.Telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brunab.projeto.Entidade.Funcionario;
import com.example.brunab.projeto.R;

public class Funcionarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funcionarios);
    }
    public void novo (View view){
        Intent it = new Intent(Funcionario.this, Cadastro_Funcionarios.class);
        startActivity(it);
    }
}
