package com.dmat.zerowaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_recycle_page.*

class RecyclePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_page)

        val actionBar = supportActionBar
        actionBar!!.title = "Recycle Your Waste"

        bottom_navmenu.itemIconTintList = null


        /*val navController = findNavController(R.id.fragment_container)
        bottom_navmenu.setupWithNavController(navController)*/



        /*if (!navController.popBackStack()) {
            // Call finish() on your Activity
            finish()
        }*/



        fun load_frag(frag: Fragment) {
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.fragment_container, frag)
            ft.commit()

        }

        //load_frag(OrganicWasteFragment())

        bottom_navmenu.setOnItemSelectedListener() {
            when (it.itemId) {
                R.id.organicWasteFragment -> load_frag(OrganicWasteFragment())
                R.id.liquid_waste_page -> load_frag(liquid_waste_page())
                R.id.hazardous_waste_page -> load_frag(hazardous_waste_page())
            }
            true
        }

        /*val organic_waste_butt: Button = findViewById(R.id.organic_waste_butt)
        val liquid_waste_butt: Button = findViewById(R.id.liquid_waste_butt)
        val hazardous_waste_butt: Button = findViewById(R.id.hazardous_waste_butt)

        organic_waste_butt.setOnClickListener {
            val organicIntent = Intent(this, OrganicWastePage::class.java)
            startActivity(organicIntent)
        }

        liquid_waste_butt.setOnClickListener {
            val liquidIntent = Intent(this, liquid_waste_page::class.java)
            startActivity(liquidIntent)
        }

        hazardous_waste_butt.setOnClickListener {
            val hazardousIntent = Intent(this, hazardous_waste_page::class.java)
            startActivity(hazardousIntent)
        }*/

    }

}
