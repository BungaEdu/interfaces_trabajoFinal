package com.example.interfaces_trabajofinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.interfaces_trabajofinal.databinding.ActivityPaginaReproductorBinding


class PaginaReproductor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityPaginaReproductorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var serieElegida = intent.getStringExtra("serieElegida")

        if (serieElegida == "miercoles") {

            binding.imgReproductor.setImageResource(R.drawable.img_pantallaprincipal_walking)
        }


    }
}