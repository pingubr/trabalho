package com.example.brunab.projeto.Telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.brunab.projeto.Entidade.Cliente;
import com.example.brunab.projeto.R;

public class Cadastro_Clientes extends AppCompatActivity {

    private EditText txNome;
    private EditText txEndereco;
    private EditText txRG;
    private EditText txCPF;
    private EditText txCNH;
    private EditText txDependentes;

    Cliente c;

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

    public void salvar(View view){
        if(c == null)
            c = new Cliente();
        c.setNome(txNome.getText().toString());
        c.setEndereco(txEndereco.getText().toString());
        c.setRg(txRG.getText().toString());
        c.setCpf(txCPF.getText().toString());
        c.setCnh(txCNH.getText().toString());
        c.setNumDependentes(Integer.parseInt(txDependentes.getText().toString()));
        finish();
    }

    public void cancelar(View view){
        finish();
    }
}
