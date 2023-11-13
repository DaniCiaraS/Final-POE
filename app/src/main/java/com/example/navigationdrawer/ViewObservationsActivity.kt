package com.example.navigationdrawer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationdrawer.nav_fragment.BirdObservation
import com.example.navigationdrawer.nav_fragment.ObservationListAdapter

class ViewObservationsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var observationList: MutableList<BirdObservation>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_view_observations)

        recyclerView = findViewById(R.id.recyclerViewObservations)
        observationList = loadObservationsFromStorage()

        val adapter = ObservationListAdapter(observationList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun loadObservationsFromStorage(): MutableList<BirdObservation> {

        return mutableListOf() // Placeholder for loading data
    }
}
