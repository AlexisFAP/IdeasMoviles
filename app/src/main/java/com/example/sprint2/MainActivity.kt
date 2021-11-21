package com.example.sprint2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var listLugares: ArrayList<Lugares>
    private lateinit var lugaresAdapter: LugaresAdapter
    private lateinit var lugaresRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lugaresRecyclerView = findViewById(R.id.lugares_recycler_view)

        listLugares = createMockLugares()

        lugaresAdapter = LugaresAdapter(listLugares)

        //lugaresRecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        lugaresRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = lugaresAdapter
            setHasFixedSize(false)
        }

        lugaresRecyclerView.adapter = lugaresAdapter
    }

    private fun createMockLugares(): ArrayList<Lugares>{
        return arrayListOf(
            Lugares(
                foto = "a",
                nombre = "Lugar 1",
                descripcion = "Descripción 1",
                puntuacion = "Puntuación 1"
            ),
            Lugares(
                foto = "a",
                nombre = "Lugar 2",
                descripcion = "Descripción 2",
                puntuacion = "Puntuación 2"
            ),
        )
    }
}