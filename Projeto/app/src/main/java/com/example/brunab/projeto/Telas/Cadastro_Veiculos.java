package com.example.brunab.projeto.Telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.brunab.projeto.Dao.Dao;
import com.example.brunab.projeto.Entidade.Carro;
import com.example.brunab.projeto.R;

public class Cadastro_Veiculos extends AppCompatActivity {

    private EditText txMarca;
    private EditText txModelo;
    private EditText txCor;
    private EditText txPlaca;
    private EditText txSeguro;
    private EditText txAluguel;

    Carro c;
    private Dao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__veiculos);
        //Variáveis responsáveis por apontar para os campos de texto da tela de cadastro de veículos.
        txMarca = findViewById(R.id.etMarca);
        txModelo = findViewById(R.id.etModelo);
        txCor = findViewById(R.id.etCor);
        txPlaca = findViewById(R.id.etPlaca);
        txSeguro = findViewById(R.id.etSeguro);
        txAluguel = findViewById(R.id.etAluguel);
    }

    //Função de Cadastro do Carro
    public void salvar(View view){

        //Verifica se o carro já existe. Caso contrário, um novo carro é criado.
        if(c == null) {
            c = new Carro();
        }

        //Recolhe as informações referentes ao carro e salva no banco de dados.
        c.setMarca(txMarca.getText().toString());
        c.setModelo(txModelo.getText().toString());
        c.setCor(txCor.getText().toString());
        c.setPlaca(txPlaca.getText().toString());
        c.setValorSeguro(Float.parseFloat(txSeguro.getText().toString()));
        c.setValorLocacao(Float.parseFloat(txAluguel.getText().toString()));
        dao.Salvar(c);

        finish();
    }

    public void cancelar(View view){
        finish();
    }
}
