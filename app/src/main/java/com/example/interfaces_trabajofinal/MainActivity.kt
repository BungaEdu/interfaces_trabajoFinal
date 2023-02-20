package com.example.interfaces_trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.interfaces_trabajofinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*binding.botonRegistrar.setOnClickListener {
            val intentRegistrar = Intent(this, Login::class.java)
            //intentCrearPers.putExtra("enviarImagenClase", enviarImagenClase)
            startActivity(intentRegistrar)
        }

        binding.botonLogin.setOnClickListener {
            val intentLogin = Intent(this, PaginaPrincipal::class.java)
            //intentElegirPers.putExtra("enviarImagenClase", enviarImagenClase)
            startActivity(intentLogin)
        }*/

    }
}