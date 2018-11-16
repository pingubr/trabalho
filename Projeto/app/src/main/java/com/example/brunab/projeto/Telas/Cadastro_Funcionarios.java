package com.example.brunab.projeto.Telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.brunab.projeto.R;

public class Cadastro_Funcionarios extends AppCompatActivity {

    private EditText txNome;
    private EditText txRua;
    private EditText txRG;
    private EditText txCPF;
    private CheckBox cbSupervisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__funcionarios);
        txNome = findViewById(R.id.etNome);
        txRua = findViewById(R.id.etEndereco);
        txRG = findViewById(R.id.etRG);
        txCPF = findViewById(R.id.etCPF);
        cbSupervisor = findViewById(R.id.cbSuper);
    }
}
