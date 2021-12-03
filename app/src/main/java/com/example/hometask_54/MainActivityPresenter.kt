package com.example.hometask_54

class MainActivityPresenter(val mainView: MainActivityContract.MainView): MainActivityContract.Presenter {
    override fun showBlueFragment() {

        val fragment = BlueFragment.newInstance("","")
        fragment.setPresenter(this)
        mainView.setFragment(fragment)
    }

    override fun showGreenFragment() {

        val fragment = GreenFragment.newInstance("","")
        fragment.setPresenter(this)
        mainView.setFragment(fragment)

    }

    override fun showRedFragment() {

        val fragment = RedFragment.newInstance("","")
        fragment.setPresenter(this)
        mainView.setFragment(fragment)

    }

    override fun showOrangeFragment() {

        val fragment = OrangeFragment.newInstance("","")
        fragment.setPresenter(this)
        mainView.setFragment(fragment)

    }

}