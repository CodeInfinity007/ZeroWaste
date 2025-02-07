package com.dmat.zerowaste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        //val navigationView: NavigationView = findViewById(R.id.nav)
        val recyclebutt: Button = findViewById(R.id.recyclebutt)
        val reduce_butt: Button = findViewById(R.id.reduce_butt)
        val reuse_butt: Button = findViewById(R.id.reuse_butt)
        val repurpose_butt: Button = findViewById(R.id.repurpose_butt)


        recyclebutt.setOnClickListener {
            val recycleIntent = Intent(this, RecyclePage::class.java)
            startActivity(recycleIntent)
        }

        reduce_butt.setOnClickListener {
            val reduceIntent = Intent(this, ReducePage::class.java)
            startActivity(reduceIntent)
        }

        reuse_butt.setOnClickListener {
            val reuseIntent = Intent(this, ReusePage::class.java)
            startActivity(reuseIntent)
        }

        repurpose_butt.setOnClickListener {
            val repurposeIntent = Intent(this, RepurposePage::class.java)
            startActivity(repurposeIntent)
        }


    }

}
