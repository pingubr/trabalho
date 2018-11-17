package com.example.brunab.projeto.Telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.brunab.projeto.R;

public class Cadastro_Veiculos extends AppCompatActivity {

    private EditText txMarca;
    private EditText txModelo;
    private EditText txCor;
    private EditText txPlaca;
    private EditText txSeguro;
    private EditText txAluguel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__veiculos);
        txMarca = findViewById(R.id.etMarca);
        txModelo = findViewById(R.id.etModelo);
        txCor = findViewById(R.id.etCor);
        txPlaca = findViewById(R.id.etPlaca);
        txSeguro = findViewById(R.id.etSeguro);
        txAluguel = findViewById(R.id.etAluguel);
    }
}
