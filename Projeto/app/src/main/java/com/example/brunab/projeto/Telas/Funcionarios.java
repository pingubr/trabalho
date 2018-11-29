package com.example.brunab.projeto.Telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.brunab.projeto.Entidade.Funcionario;
import com.example.brunab.projeto.R;

import java.io.Serializable;

public class Funcionarios extends AppCompatActivity {
    private ListView viewFuncionarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funcionarios);
        viewFuncionarios = findViewById(R.id.funci_view);

        viewFuncionarios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //Este overrride sobreescreve quando clica no item cliente dentro do list view
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent it = new Intent(Funcionarios.this, Cadastro_Funcionarios.class);
                it.putExtra("Funcionários", (Serializable) parent.getItemAtPosition(i));
                startActivity(it);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayAdapter<Funcionario> adapter = new ArrayAdapter<Funcionario>(this, android.R.layout.simple_list_item_1, listar());
        viewFuncionarios.setAdapter(adapter);
    }
    /*
    private List listar(){
        metodo para puxar do banco e preencher uma lista
    }*/



    public void novo (View view){
        Intent it = new Intent(Funcionarios.this, Cadastro_Funcionarios.class);
        startActivity(it);
    }
}
