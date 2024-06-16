package com.example.mvptests

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        presenter = MainPresenter(this)

        button.setOnClickListener {
            presenter.onButtonClicked()
        }
    }

    override fun showMessage(message: String) {
        textView.text = message
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}