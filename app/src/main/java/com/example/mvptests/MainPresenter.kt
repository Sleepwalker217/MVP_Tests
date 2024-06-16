package com.example.mvptests

class MainPresenter(private var view: MainView?) {

    fun onButtonClicked() {
        view?.showMessage("Hello, MVP!")
    }

    fun detachView() {
        view = null
    }
}