package com.example.brunab.projeto.Telas;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.brunab.projeto.Entidade.Cliente;
import com.example.brunab.projeto.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Clientes extends AppCompatActivity {

    private ListView viewClientes;
    DatabaseReference database;
    private Button btNovo;


    private ArrayList<String> arrayList = new ArrayList<>(); // adaptador para usar no list view
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clientes);

        database = FirebaseDatabase.getInstance().getReference(); //vinculando a database

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        btNovo = findViewById(R.id.btAdd);
        viewClientes = findViewById(R.id.cliente_view);

        database.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String string = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        })




        viewClientes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //Este overrride sobreescreve quando clica no item cliente dentro do list view
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent it = new Intent(Cliente.this, Cadastro_Clientes.class);
                it.putExtra("Cliente", (Serializable) parent.getItemAtPosition(i));
                startActivity(it);
            }
        }
    }
    public void novo (View view){
        Intent it = new Intent(Cliente.this, Cadastro_Clientes.class);
        startActivity(it);
    }
    //Este overrride atualiza a tela toda vez
    @Override
    protected void onResume() {
        super.onResume();

        ArrayAdapter<Cliente> adapter = new ArrayAdapter<Cliente>(this, android.R.layout.simple_list_item_1, listar());
        viewClientes.setAdapter(adapter);
    }
    private List listar(){

    }
}
