package com.example.interfaces_trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.interfaces_trabajofinal.databinding.ActivityCalificacionBinding
import com.example.interfaces_trabajofinal.databinding.ActivityPaginaReproductorBinding

class Calificacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calificacion)

        val binding = ActivityCalificacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var serieElegida = intent.getStringExtra("serieElegida")


        if (serieElegida == "miercoles") {
            binding.textTitulo.text = "Miércoles"
            binding.textAnyos.text = "+12"
            binding.textDescAnyo.text = "miedo o angustia, violencia"
            binding.textoReparto.text = "Jenna Ortega \n\n Gwendoline Christle \n\n Riki Lindhome \n\n Christina Ricci \n\n Jamie McShane \n\n Hunter Doohan \n\n Percy Hynes White \n\n Emma Myers \n\n Joy sunday \n\n Moosa Mostafa \n\n Georgie Farmer \n\n Naomi J. Ogawa \n\n Catherine Zeta-Jones"
            binding.btCerrar.setOnClickListener() {
                val intentMain = Intent(this, PaginaReproductor::class.java)
                intentMain.putExtra("serieElegida", "miercoles")
                startActivity(intentMain)
            }
        }

       if (serieElegida == "elite") {
            binding.textTitulo.text = "Élite"
            binding.textAnyos.text = "+16"
            binding.textDescAnyo.text = "Desnudez, sexo, vilencia sexual, drogas y sustancias tóxicas"
            binding.textoReparto.text = "Itzan Escamilla \n\n Miguel Bernardeu \n\n Danna Paola \n\n Arón Piper \n\n Omar Ayuso \n\n Claudia Salas \n\n Georgina Amorós \n\n Álvaro Rico \n\n Ester Expósito \n\n Manu Ríos \n\n Carla Diaz \n\n Martina Caridicci"
            binding.btCerrar.setOnClickListener() {
                val intentMain = Intent(this, PaginaReproductor::class.java)
                intentMain.putExtra("serieElegida", "elite")
                startActivity(intentMain)
            }
        }

        if (serieElegida == "walking") {
            binding.textTitulo.text = "The Walking Dead"
            binding.textAnyos.text = "+18"
            binding.textDescAnyo.text = "miedo o angustia, violencia"
            binding.textoReparto.text = "Andrew Lincoln \n\n Steven Yeun \n\n Norman Reedus \n\n Chandler Riggs \n\n Melissa McBride \n\n Lauren Cohan \n\n danai Gurira \n\n Alanna Masterson \n\n Nosequa Martin-Green \n\n Josh McDermitt \n\n Christian Serratos \n\n Seth Gilliam \n\n Ross Marquand"
            binding.btCerrar.setOnClickListener() {
                val intentMain = Intent(this, PaginaReproductor::class.java)
                intentMain.putExtra("serieElegida", "walking")
                startActivity(intentMain)
            }
        }


    }
}