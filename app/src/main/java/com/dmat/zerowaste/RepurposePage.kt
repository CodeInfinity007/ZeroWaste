package com.dmat.zerowaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RepurposePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repurpose_page)

        val actionBar = supportActionBar
        actionBar!!.title = "Repurpose Your Waste"

    }
}