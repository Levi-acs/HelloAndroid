package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SaudacaoActivity extends Activity {

    public static final String EXTRA_NOME_USUARIO = "helloandroid.EXTRA_NOME_USUARIO";
    public static final	String ACAO_EXIBIR_SAUDACAO ="helloandroid.ACAO_EXIBIR_SAUDACAO";

    public static final	String	CATEGORIA_SAUDACAO	= "helloandroid.CATEGORIA_SAUDACAO";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saudacao_activity);


        TextView saudacaoTextView = findViewById(R.id.saudacaoTextView);

        String nome = getIntent().getStringExtra(EXTRA_NOME_USUARIO);

        if (nome == null || nome.isEmpty()) {
            saudacaoTextView.setText("nome não informado");
        } else {
            saudacaoTextView.setText("Olá " + nome);
        }
    }
}

