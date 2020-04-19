package com.example.tarea4


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import android.content.Intent
import kotlinx.android.synthetic.main.content_item.*
import kotlinx.android.synthetic.main.content_item.view.*


class AdapterModel (var list:ArrayList<Model>): RecyclerView.Adapter<AdapterModel.ViewHolder>() {

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){

        fun bindItem(data:Model){

            itemView.tvtexto.text = data.nombre
            itemView.tvDescripcion.text = data.descripcion
            Glide.with(itemView.context).load(data.thumbnail).into(itemView.thumbnail)
            itemView.setOnClickListener{
                val tag = "com.example.tarea4.platillos.platillo"
                val intent = Intent( it.context, PlatilloActivity::class.java)
                intent.putExtra(tag, data.id.toString())
                it.context.startActivity(intent)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder (view)
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }
}