package com.example.hometask_54

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityContract.MainView {

    val presenter = MainActivityPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btBlue.setOnClickListener {
            presenter.showBlueFragment()
        }


        btGreen.setOnClickListener {
            presenter.showGreenFragment()
        }


        btRed.setOnClickListener {
            presenter.showRedFragment()
        }

        btOrange.setOnClickListener {
            presenter.showOrangeFragment()
        }


    }



    override fun setFragment(fragment: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flContainer,fragment)
            .commit()
    }

    override fun updateTopMenu() {

    }


}