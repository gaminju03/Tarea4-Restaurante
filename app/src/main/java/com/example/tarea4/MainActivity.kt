package com.example.tarea4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
