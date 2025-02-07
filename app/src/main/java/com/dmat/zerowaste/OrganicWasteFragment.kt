package com.dmat.zerowaste

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.organic_waste_fragment_page.*

class OrganicWasteFragment : Fragment() {

    /*override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.organic_waste_fragment_page, container, false)
    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.organic_waste_fragment_page, container, false)


        val compost_butt: Button = view.findViewById(R.id.compost_butt)
        val animal_feed_butt: Button = view.findViewById(R.id.animal_feed_butt)
        val animal_feed_content: View? = view.findViewById(R.id.animal_feed_content)
        val rendering_butt: Button? = view.findViewById(R.id.rendering_butt)
        val rendering_content: View? = view.findViewById(R.id.rendering_content)
        //val rapid_fermentation_butt: Button = view.findViewById(R.id.fermentation_butt)
        val fermentation_link: TextView? = view.findViewById(R.id.fermentation_link)

        if (fermentation_link != null) {
            fermentation_link.movementMethod = LinkMovementMethod.getInstance()
        }

        animal_feed_content!!.isGone = true
        rendering_content!!.isGone = true

        compost_butt.setOnClickListener {
            val compostIntent = Intent(context, composting_page::class.java)
            startActivity(compostIntent)

            animal_feed_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.animal_feed_icon,
                0,
                R.drawable.plus,
                0
            )

            rendering_butt!!.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.rendering_icon,
                0,
                R.drawable.plus,
                0
            )

            animal_feed_content.isGone = true
            rendering_content.isGone = true

        }

        animal_feed_butt.setOnClickListener {
            animal_feed_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.animal_feed_icon,
                0,
                R.drawable.minus_icon,
                0
            )

            animal_feed_content.isGone = false
            rendering_content.isGone = true

            rendering_butt!!.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.rendering_icon,
                0,
                R.drawable.plus,
                0
            )
        }

        rendering_butt!!.setOnClickListener {
            rendering_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.rendering_icon,
                0,
                R.drawable.minus_icon,
                0
            )

            rendering_content.isGone = false
            animal_feed_content.isGone = true

            animal_feed_butt.setCompoundDrawablesRelativeWithIntrinsicBounds(
                R.drawable.animal_feed_icon,
                0,
                R.drawable.plus,
                0
            )
        }


        return view
    }
}
