package com.example.interfaces_trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.interfaces_trabajofinal.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Botón para volver a la pantalla MainActivity
        binding.btLoginAtras.setOnClickListener {
            val intentMain = Intent(this, MainActivity::class.java)
            startActivity(intentMain)
        }

        //Botón para guardar, al pulsar sale un toast y vas a la pantalla MainActivity
        binding.btGuardar.setOnClickListener {
            val nombre = binding.editNombrePerfil.text
            if (nombre.isEmpty()){
                Toast.makeText(
                    this, "Debes rellenar el nombre del perfil",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this, "Usuario $nombre añadido",
                    Toast.LENGTH_LONG
                ).show()
                val intentMain = Intent(this, MainActivity::class.java)
                startActivity(intentMain)
            }
        }
    }
}