package com.example.navigationdrawer.nav_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationdrawer.R

class ObservationListAdapter(private val observationList: List<BirdObservation>) :
    RecyclerView.Adapter<ObservationListAdapter.ObservationViewHolder>() {

    inner class ObservationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val speciesTextView: TextView = itemView.findViewById(R.id.speciesTextView)
        val notesTextView: TextView = itemView.findViewById(R.id.notesTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObservationViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.observation_item, parent, false)
        return ObservationViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ObservationViewHolder, position: Int) {
        val observation = observationList[position]
        holder.speciesTextView.text = observation.species
        holder.notesTextView.text = observation.notes
        // Add more bindings as needed
    }

    override fun getItemCount(): Int {
        return observationList.size
    }
}
