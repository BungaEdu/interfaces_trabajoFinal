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

        //Llamamos a los botones de los perfiles para que al pulsar vaya a la activity PaginaPrincipal
        binding.btPerfil1.setOnClickListener {
            val intentRegistrar = Intent(this, PaginaPrincipal::class.java)
            startActivity(intentRegistrar)
        }
        binding.btPerfil2.setOnClickListener {
            val intentRegistrar = Intent(this, PaginaPrincipal::class.java)
            startActivity(intentRegistrar)
        }
        binding.btPerfil3.setOnClickListener {
            val intentRegistrar = Intent(this, PaginaPrincipal::class.java)
            startActivity(intentRegistrar)
        }

        ////Llamamos al boton de añadir perfil para que al pulsar vaya a la activity Login
        binding.btRegistro.setOnClickListener {
            val intentLogin = Intent(this, Login::class.java)
            startActivity(intentLogin)
        }

    }
}