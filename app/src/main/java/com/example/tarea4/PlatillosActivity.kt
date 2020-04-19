package com.example.tarea4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_platillos.*

class PlatillosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platillos)

        recycler.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val models =ArrayList<Model>()

        models.add(Model(0,"Pastel", "Un pastel es, según la definición del Diccionario de la lengua española de la Real Academia Española, una «masa de harina y manteca, cocida al horno", R.drawable.img1))
        models.add(Model(1,"Gelatina", "La gelatina es un coloide gel, incolora, translúcida, quebradiza e insípida La gelatina es una proteína compleja, es decir, un polímero compuesto de aminoácidos", R.drawable.img2))
        models.add(Model(2,"Helado", "En su forma más simple, el helado o crema helada es un alimento congelado que por lo general se hace de productos lácteos tales como leche o crema, a menudo en combinación con frutas u otros ingredientes y sabores", R.drawable.img3))
        models.add(Model(3,"Caramelo","El caramelo es un alimento preparado generalmente a base de azúcar. El caramelo se consigue mediante la cocción de azúcares. Este puede consumirse tanto líquido, como sólido.", R.drawable.img4))
        models.add(Model(4,"Frappe","El café frappé es un café con hielo cubierto de espuma elaborado a partir de café instantáneo. Es muy popular en Grecia y Chipre, especialmente durante el verano, si bien se ha extendido a otros países.\u200B\u200B." , R.drawable.img5))

        val adapter=AdapterModel(models)
        recycler.adapter = adapter
    }
}
