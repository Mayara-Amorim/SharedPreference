package com.example.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaudacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saudacao)

        val txvSaudacao = findViewById<TextView>(R.id.txt_saudacao)
        val saudacaoSharedPreferences = this.getSharedPreferences("saudacao", Context.MODE_PRIVATE)
        val nome = saudacaoSharedPreferences.getString("nome", "")
        val tratamento = saudacaoSharedPreferences.getString("tratamento", "")

        if(tratamento.equals("Sem tratamento")){
            txvSaudacao.text = nome
        }else{
            txvSaudacao.text = tratamento + " " + nome
        }
    }
}