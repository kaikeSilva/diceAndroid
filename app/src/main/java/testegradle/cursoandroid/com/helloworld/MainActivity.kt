package testegradle.cursoandroid.com.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

        lateinit var btnRolar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRolar = findViewById(R.id.button)

        var imagens = mutableListOf<ImageView>(dice_image1,dice_image2)

        btnRolar.setOnClickListener() { it: View? ->

            //percorer cada imagem e mudar o image resource
            //por que não funciona ? imagens.forEach(rolarDado(it as ImageView))

            for (i in 0..(imagens.size-1)){
                rolarDado(imagens[i])
            }

        }

    }


}

//atribui imagem ao dado de acordo com numero aleatório gerado
fun rolarDado(imagem : ImageView){
    var numero = (1..5).random() +1

    var recursoDeImagem2 = when (numero) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        6 -> R.drawable.dice_6
        else -> R.drawable.empty_dice
    }
    imagem.setImageResource(recursoDeImagem2)
}


