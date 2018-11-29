package com.example.brunab.projeto.Telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.brunab.projeto.Entidade.Carro;
import com.example.brunab.projeto.R;

import java.io.Serializable;

public class Veiculos extends AppCompatActivity {

    private ListView viewVeiculos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veiculos);

        viewVeiculos = findViewById(R.id.veiculo_view);
        viewVeiculos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //Este overrride sobreescreve quando clica no item cliente dentro do list view
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent it = new Intent(Veiculos.this, Cadastro_Veiculos.class);
                it.putExtra("Carro", (Serializable) parent.getItemAtPosition(i));
                startActivity(it);
            }
        });
    }
    public void novo (View view){
        Intent it = new Intent(Veiculos.this, Cadastro_Veiculos.class);
        startActivity(it);

    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayAdapter<Carro> adapter = new ArrayAdapter<Carro>(this, android.R.layout.simple_list_item_1, listar());
        viewVeiculos.setAdapter(adapter);
    }
    /*
    private List listar(){
        metodo para puxar do banco e preencher uma lista
    }*/
}
