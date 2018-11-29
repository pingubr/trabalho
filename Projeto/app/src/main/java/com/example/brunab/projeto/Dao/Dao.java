package com.example.brunab.projeto.Dao;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Dao {

    DatabaseReference database;

    //essa parte vai salvar o objeto
    public void Salvar(Object f){
        String id = database.push().getKey(); //esse string vai puxar o proximo id disponivel do banco
        database=FirebaseDatabase.getInstance().getReference(f.getClass().getSimpleName());
        database.child(id).setValue(f); //essa parte vai salvar o objeto no id obtido
    }

    //essa parte vai remover o objeto
    public void Excluir(Object f){
        database=FirebaseDatabase.getInstance().getReference(f.getClass().getSimpleName());
        database.child(f.toString()).removeValue((DatabaseReference.CompletionListener) f);// essa parte removerá o
        // objeto a partir do id informado
    }

}
