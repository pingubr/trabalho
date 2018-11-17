package com.example.brunab.projeto.Telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.brunab.projeto.R;

public class Cadastro_Clientes extends AppCompatActivity {

    private EditText txNome;
    private EditText txEndereco;
    private EditText txRG;
    private EditText txCPF;
    private EditText txCNH;
    private EditText txDependentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__clientes);
        txNome = findViewById(R.id.cNome);
        txEndereco = findViewById(R.id.cEndereco);
        txRG = findViewById(R.id.cRG);
        txCPF = findViewById(R.id.cCPF);
        txCNH = findViewById(R.id.cCNH);
        txDependentes = findViewById(R.id.cDependentes);
    }
}
