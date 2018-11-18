package com.example.brunab.projeto.Telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brunab.projeto.Entidade.Funcionario;
import com.example.brunab.projeto.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference databaseFuncionario;
        databaseFuncionario=FirebaseDatabase.getInstance().getReference("Funcionarios");

        String id = databaseFuncionario.push().getKey();

        Funcionario funcionario = new Funcionario(id, "63913658300", "299957480", "Hector", "Avenida");

        databaseFuncionario.child(id).setValue(funcionario);
    }
}
