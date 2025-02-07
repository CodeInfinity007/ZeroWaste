package com.dmat.zerowaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ReusePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reuse_page)

        val actionBar = supportActionBar
        actionBar!!.title = "Reuse Your Waste"

    }
}