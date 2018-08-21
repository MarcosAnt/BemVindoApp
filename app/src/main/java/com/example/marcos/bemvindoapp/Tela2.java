package com.example.marcos.bemvindoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                String nome = params.getString("nome");
                int idade = params.getInt("idade");
                TextView tvNome = (TextView)findViewById(R.id.nome);
                TextView tvIdade = (TextView)findViewById(R.id.idade);
                tvNome.setText(nome);
                tvIdade.setText(String.valueOf(idade));

            }
        }
    }

}
