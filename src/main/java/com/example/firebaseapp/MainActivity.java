package com.example.firebaseapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference usuarios = reference.child("usuarios");
        DatabaseReference produtos = reference.child("produto");

        Usuario usuario = new Usuario();
        usuario.setNome("Felipe");
        usuario.setSobrNome("Sant ana");
        usuario.setIdade(30);

        usuarios.child("001").setValue(usuario);

        Produto produto = new Produto();
        produto.setMarca("Nexus");
        produto.setPreco(899.99);
        produto.setDescricao("LG");

        produtos.child("001").setValue(produto);


    }
}
