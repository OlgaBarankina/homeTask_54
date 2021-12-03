package com.example.hometask_54

import androidx.fragment.app.Fragment

interface MainActivityContract {


    interface MainView {
        fun setFragment(fragment: Fragment)
        fun updateTopMenu()
    }


    interface BlueFragmentView{
        fun setPresenter(presenter: Presenter)
    }

    interface GreenFragmentView{
        fun setPresenter(presenter: Presenter)
    }

    interface RedFragmentView{
        fun setPresenter(presenter: Presenter)
    }

    interface OrangeFragmentView{
        fun setPresenter(presenter: Presenter)
    }

    interface Presenter {
        fun showBlueFragment()
        fun showGreenFragment()
        fun showRedFragment()
        fun showOrangeFragment()
    }


}