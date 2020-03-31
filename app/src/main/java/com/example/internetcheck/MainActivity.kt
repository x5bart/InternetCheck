package com.example.internetcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var connectionDetector: ConnectionDetector


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectionDetector = ConnectionDetector()
        connectionDetector.isNetworkAvailable(this@MainActivity)

        network.setOnClickListener {
            if (connectionDetector.isNetworkAvailable(this@MainActivity)) {
                Toast.makeText(applicationContext,
                        "net is there", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext,
                        "no net", Toast.LENGTH_LONG).show()
            }
        }

    }
}
