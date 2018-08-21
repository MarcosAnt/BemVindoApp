package com.example.marcos.bemvindoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
    }

    public void onClick(View view){
        Intent it = new Intent(this, Tela2.class);

        EditText nome = (EditText)findViewById(R.id.nome);
        EditText idade = (EditText)findViewById(R.id.idade);

        Bundle params = new Bundle();

        params.putString("nome", nome.getText().toString());
        params.putInt("idade", Integer.parseInt(idade.getText().toString()));

        //Seta parametros para próxima view
        it.putExtras(params);

        //Chama segunda view
        startActivity(it);
    }
}
