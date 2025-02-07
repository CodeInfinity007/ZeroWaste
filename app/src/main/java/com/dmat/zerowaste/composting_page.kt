package com.dmat.zerowaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.view.isGone

class composting_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_composting_page)

        val actionBar = supportActionBar
        //actionBar!!.setDisplayHomeAsUpEnabled(true)

        // Defining Action Bar Title

        actionBar!!.title = "Composting"

        // All components
        val basic_compost: Button = findViewById(R.id.basic_method_butt)
        val basic_method_content: View? = findViewById(R.id.basic_method_content)
        val trench_method_butt: Button = findViewById(R.id.trench_method_butt)
        val trench_compost_content: TextView = findViewById(R.id.trench_compost_content)
        val vermi_butt: Button = findViewById(R.id.vermi_method_butt)
        val vermi_compost_content: FrameLayout = findViewById(R.id.vermi_compost_content)

        // Hiding content at startup
        basic_method_content!!.isGone = true
        trench_compost_content.isGone = true
        vermi_compost_content.isGone = true


        // Basic Compost butt click activity
        basic_compost.setOnClickListener {
            basic_compost.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.composting_icon,
                0,
                R.drawable.minus_icon,
                0
            )
            basic_method_content.isGone = false
            vermi_compost_content.isGone = true
            trench_compost_content.isGone = true
            vermi_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.vermi_icon,
                0,
                R.drawable.plus,
                0
            )
            trench_method_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.trench_icon,
                0,
                R.drawable.plus,
                0
            )



        }

        // Trench Compost butt click activity
        trench_method_butt.setOnClickListener {
            trench_method_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.trench_icon,
                0,
                R.drawable.minus_icon,
                0
            )
            trench_compost_content.isGone = false
            basic_method_content.isGone = true
            vermi_compost_content.isGone = true

            basic_compost.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.composting_icon,
                0,
                R.drawable.plus,
                0
            )
            vermi_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.vermi_icon,
                0,
                R.drawable.plus,
                0
            )
        }

        // VermiComposting butt click activity
        vermi_butt.setOnClickListener {
            vermi_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.vermi_icon,
                0,
                R.drawable.minus_icon,
                0
            )
            vermi_compost_content.isGone = false
            basic_method_content.isGone = true
            trench_compost_content.isGone = true

            trench_method_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.trench_icon,
                0,
                R.drawable.plus,
                0
            )
            basic_compost.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.composting_icon,
                0,
                R.drawable.plus,
                0
            )
        }

    }
}
