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

        //Botón con icono de Netflix para volver a la pantalla de elegir perfil
        binding.btInicio.setOnClickListener {
            val intentMain = Intent(this, MainActivity::class.java)
            startActivity(intentMain)
        }

        //Estos botones te llevan a la PaginaReproductor y te guardan la información
        //del boton en forma de String para pasarlo a las siguientes pantallas y saber
        //qué información mostrar.

        binding.btImgMiercoles.setOnClickListener {
            val intentMain = Intent(this, PaginaReproductor::class.java)
            //Yo llamo a serie y me devuelve el valor de al lado, el value.
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