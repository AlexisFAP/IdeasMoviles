package com.example.sprint2

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class LugaresAdapter(
    private val lugaresList: ArrayList<Lugares>
): RecyclerView.Adapter<LugaresAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_lugar_item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lugar = lugaresList[position]
        holder.bind(lugar)
    }

    override fun getItemCount(): Int {
        return lugaresList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var nombreTextView: TextView = itemView.findViewById(R.id.textView)
        private var descripcionTextView: TextView = itemView.findViewById(R.id.textView2)
        private var puntuacionTextView: TextView = itemView.findViewById(R.id.textView3)
        private var fotoTextView: ImageView = itemView.findViewById(R.id.imageView2)

        fun bind(lugar: Lugares){
            nombreTextView.text = lugar.nombre
            descripcionTextView.text = lugar.descripcion
            puntuacionTextView.text = lugar.puntuacion
            //fotoTextView.
        }
    }
}