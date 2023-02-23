package com.example.interfaces_trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.interfaces_trabajofinal.databinding.ActivityPaginaPrincipalBinding

class PaginaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal)

        val binding = ActivityPaginaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btInicio.setOnClickListener {
            val intentMain = Intent(this, MainActivity::class.java)
            startActivity(intentMain)
        }

        binding.btImgMiercoles.setOnClickListener {
            val intentMain = Intent(this, PaginaReproductor::class.java)
            //Yo llamo a serie y me devuelve el valor de al lao, el value.
            intentMain.putExtra("serieElegida", "miercoles")
            startActivity(intentMain)
        }

        binding.btImgElite.setOnClickListener {
            val intentMain = Intent(this, PaginaReproductor::class.java)
            intentMain.putExtra("serieElegida", "elite")
            startActivity(intentMain)
        }

        binding.btImgWalking.setOnClickListener {
            val intentMain = Intent(this, PaginaReproductor::class.java)
            intentMain.putExtra("serieElegida", "walking")
            startActivity(intentMain)
        }


    }
}