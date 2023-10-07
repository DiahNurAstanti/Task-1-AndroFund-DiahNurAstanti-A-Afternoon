package com.example.android1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var et_username : EditText
    private lateinit var et_password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_username = findViewById(R.id.et_username)
        et_password = findViewById(R.id.et_password)

        val Btn_Daftar : Button = findViewById(R.id.btn_daftar)
        Btn_Daftar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_daftar -> {
                val bundle = Bundle()
                bundle.putString("username", et_username.text.toString())
                bundle.putString("password", et_password.text.toString())

                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}