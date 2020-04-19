package com.example.tarea4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_platillo.*

class PlatilloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platillo)

        val tag = "com.example.tarea4"
        val id:String = intent.getStringExtra(tag)

        print(id)
        var model = Model(-1,"","", R.drawable.img0)

        when (id) {
            "0" -> model = Model(0,"Pastel", "Un pastel es, según la definición del Diccionario de la lengua española de la Real Academia Española, una «masa de harina y manteca, cocida al horno", R.drawable.img1)
            "1" -> model = Model(1,"Gelatina", "La gelatina es un coloide gel, incolora, translúcida, quebradiza e insípida La gelatina es una proteína compleja, es decir, un polímero compuesto de aminoácidos", R.drawable.img2)
            "2" -> model = Model(2,"Helado", "En su forma más simple, el helado o crema helada es un alimento congelado que por lo general se hace de productos lácteos tales como leche o crema, a menudo en combinación con frutas u otros ingredientes y sabores", R.drawable.img3)
            "3" -> model = Model(3,"Caramelo","El caramelo es un alimento preparado generalmente a base de azúcar. El caramelo se consigue mediante la cocción de azúcares. Este puede consumirse tanto líquido, como sólido.", R.drawable.img4)
            "4" -> model = Model(4,"Prappe","El café frappé es un café con hielo cubierto de espuma elaborado a partir de café instantáneo. Es muy popular en Grecia y Chipre, especialmente durante el verano, si bien se ha extendido a otros países\u200B\u200B." , R.drawable.img5)
        }
        tvPlatillo.text = model.nombre
        tvPlatilloDescripcion.text = model.descripcion
        imgPlatillo.setImageResource(model.thumbnail)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.manu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.Acerca-> acercaDe()
            R.id.Fuerte-> platoFuerte()
            R.id.Ensaladas-> ensalada()
            R.id.Bebidas-> bebidas()
            else -> super.onOptionsItemSelected(item)
        }

    }
    fun acercaDe():Boolean{
        val intent = Intent( this, RestauranteActivity::class.java)
        startActivity(intent)
        return true
    }
    fun platoFuerte():Boolean{
        val intent = Intent( this, PlatillosActivity::class.java)
        startActivity(intent)
        return true
    }
    fun ensalada():Boolean{
        return true
    }
    fun bebidas():Boolean{
        return true
    }
}
