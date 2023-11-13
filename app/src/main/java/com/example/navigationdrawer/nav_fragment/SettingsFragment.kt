package com.example.navigationdrawer.nav_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawer.R
import android.content.Context
import android.content.Intent
import android.widget.*

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val unitSelectionGroup = view.findViewById<RadioGroup>(R.id.unitSelectionGroup)
        val metricSwitch = view.findViewById<Switch>(R.id.metricSwitch)
        val maxDistanceEditText = view.findViewById<EditText>(R.id.maxDistanceEditText)
        val saveButton = view.findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            // Perform any save operation here

            // Show the "Preferences saved" toast
            Toast.makeText(requireContext(), "Preferences saved", Toast.LENGTH_SHORT).show()
        }


    }
}
