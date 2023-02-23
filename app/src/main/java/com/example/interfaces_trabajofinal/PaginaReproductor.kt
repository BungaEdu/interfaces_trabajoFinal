package com.example.interfaces_trabajofinal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.interfaces_trabajofinal.databinding.ActivityPaginaReproductorBinding


class PaginaReproductor : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityPaginaReproductorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var serieElegida = intent.getStringExtra("serieElegida")

        if (serieElegida == "miercoles") {
            binding.imgReproductor.setImageResource(R.drawable.img_rep_miercoles)
            binding.textNomSerie.text = "Miércoles"
            binding.textDescrip.text =
                "Cuando expulsan a Miércoles por orquestar una broma deliciosamente perversa, sus padres deciden enviarla a la Academia Nunca Más, el internado donde se enamoraron.\n" +
                        "Protagonizada por: Jenna Ortega, Gwendoline Christie, Riki Lindhome… más\n" +
                        "Creada por: Alfred Gough, Miles Millar"
        }
        if (serieElegida == "elite") {
            binding.imgReproductor.setImageResource(R.drawable.img_rep_elite)
            binding.textNomSerie.text = "Élite"
            binding.textDescrip.text =
                "Uno de los nuevos alumnos llama la atención de Patrick, y otra sorprende a Cayetana al defender a Philippe. Benjamín implanta medidas más estrictas en el colegio.\n" +
                        "Protagonizado por: Itzan Escamilla, Miguel Bernardeau, Danna Paola… más\n" +
                        "Creada por Carlos Montero, Darío Madrona"
        }
        if (serieElegida == "walking") {
            binding.imgReproductor.setImageResource(R.drawable.img_rep_walking)
            binding.textNomSerie.text = "The Walking Dead"
            binding.textDescrip.text =
                "Maggie cuenta su historia, dando inicio a una misión que debe dirigir Negan. Daryl rebusca en una base, y los auditores de la Mancomunidad vigilan al equipo de eugene.\n" +
                        "Protagonizada por: Andrew Lincoln, Steven Yeun, Norman Reedus… más"
        }

        binding.btImgAtras.setOnClickListener() {
            val intentMain = Intent(this, PaginaPrincipal::class.java)
            startActivity(intentMain)
        }
        binding.btReproducir.setOnClickListener() {
            Toast.makeText(
                this, "Capitulo no disponible",
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.btDescargar.setOnClickListener() {
            Toast.makeText(
                this, "Sin internet, no puedes realizar la descarga",
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.btImgMilista.setOnClickListener() {
            Toast.makeText(
                this, "Añadido a ''Mi Lista''",
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.btImgValorar.setOnClickListener() {
            Toast.makeText(
                this, "Gracias por tu valoración",
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.btImgCompartir.setOnClickListener() {
            Toast.makeText(
                this, "Funcionalidad desactivada",
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.btImgDescargar.setOnClickListener() {
            Toast.makeText(
                this, "Capitulo no disponible para descargar",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}
