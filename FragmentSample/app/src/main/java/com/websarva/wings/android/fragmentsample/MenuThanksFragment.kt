package com.websarva.wings.android.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class MenuThanksFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu_thanks, container, false)
        val intent = activity?.intent
        val extras = intent?.extras

        val menuName = extras?.getString("menuName")
        val menuPrice = extras?.getString("menuPrice")

        val tvMenuMame: TextView = view.findViewById<TextView>(R.id.tvMenuName)
        val tvMenuPrice: TextView = view.findViewById(R.id.tvMenuPrice)

        tvMenuMame.text = menuName
        tvMenuPrice.text = menuPrice

        val btBackButton: Button = view.findViewById(R.id.btBackButton)
        btBackButton.setOnClickListener(ButtonClickListener())

        return view
    }

    private inner class ButtonClickListener: View.OnClickListener {
        override fun onClick(v: View?) {
            activity?.finish()
        }
    }

}