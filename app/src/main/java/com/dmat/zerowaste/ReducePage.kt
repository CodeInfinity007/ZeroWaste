package com.dmat.zerowaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ReducePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reduce_page)

        val actionBar = supportActionBar
        actionBar!!.title = "Reduce Your Waste"

    }
}