package com.example.helloandroid

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {

    private lateinit var nomeEditText: EditText
    private lateinit var saudacaoTextView: TextView
    private lateinit var saudacao: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nomeEditText = findViewById(R.id.nomeEditText)
        saudacaoTextView = findViewById(R.id.saudacaoTextView)
        saudacao = resources.getString(R.string.saudacao)
    }
    fun  surpreenderUsuario(view: View) {
        // cria intent com a AÇÃO definida na SaudacaoActivity.java
        val intent = Intent(SaudacaoActivity.ACAO_EXIBIR_SAUDACAO)

        // adiciona categoria igual ao código do livro
        intent.addCategory(SaudacaoActivity.CATEGORIA_SAUDACAO)

        // pega texto do usuário
        val texto = nomeEditText.text.toString()

        // envia para SaudacaoActivity
        intent.putExtra(SaudacaoActivity.EXTRA_NOME_USUARIO, texto)

        // inicia a Activity
        startActivity(intent)

    }


}
