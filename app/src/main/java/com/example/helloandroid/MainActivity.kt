package com.example.helloandroid

import android.app.Activity
import android.os.Bundle
import android.text.Editable
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

    fun surpreenderUsuario(v: View) {
        val texto: Editable = nomeEditText.text
        val msg = "$saudacao ${texto.toString()}"
        saudacaoTextView.text = msg
    }
}
