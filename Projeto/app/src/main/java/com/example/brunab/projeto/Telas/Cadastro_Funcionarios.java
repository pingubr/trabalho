package com.example.brunab.projeto.Telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.brunab.projeto.Dao.Dao;
import com.example.brunab.projeto.Entidade.Cliente;
import com.example.brunab.projeto.Entidade.Funcionario;
import com.example.brunab.projeto.R;

public class Cadastro_Funcionarios extends AppCompatActivity {

    private EditText txNome;
    private EditText txRua;
    private EditText txRG;
    private EditText txCPF;
    private CheckBox cbSupervisor;

    Funcionario f;
    private Dao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__funcionarios);
        //Declarando as variáveis que irão apontar para os campos de texto da tela de cadastro dos funcionários.
        txNome = findViewById(R.id.cNome);
        txRua = findViewById(R.id.cEndereco);
        txRG = findViewById(R.id.cRG);
        txCPF = findViewById(R.id.cCPF);
        cbSupervisor = findViewById(R.id.cbSuper);
    }

    //Função de Cadastro do Funcionário
    public void salvar(View view){

        //Verifica se o funcionário já existe. Caso contrário, um novo funcionário é criado.
        if(f == null) {
            f = new Funcionario();
        }

        //Recolhe todas as informações nos campos de texto e salva no banco de dados.
        f.setNomeFunc(txNome.getText().toString());
        f.setEndFunc(txRua.getText().toString());
        f.setRgFunc(txRG.getText().toString());
        f.setCpfFunc(txCPF.getText().toString());


        //f.setDataAdmissao();
        //f.setDataDemissao();


        //Verifica se o funcionário é supervisor ou não.
        if(cbSupervisor.hasSelection())
            f.setSupervisor(true);
        else
            f.setSupervisor(false);

        dao.Salvar(f);
        finish();
    }

    public void cancelar(View view){
        finish();
    }
}
