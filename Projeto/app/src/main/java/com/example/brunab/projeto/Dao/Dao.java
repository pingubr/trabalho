package com.example.brunab.projeto.Dao;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Dao {
    DatabaseReference database;

    public void Salvar (Object obj){


        database=FirebaseDatabase.getInstance().getReference("???");


        database.child(obj.toString()).setValue(obj);
    }
    public void Remover (Object obj){
    }


}
