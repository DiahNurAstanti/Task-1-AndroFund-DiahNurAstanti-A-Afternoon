package com.example.android1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn_biru : Button = findViewById(R.id.btn_biru)
        val btn_pink : Button = findViewById(R.id.btn_pink)
        val btn_back : Button = findViewById(R.id.btn_back)

        btn_biru.setOnClickListener{
            replaceFragment(BiruFragment())
        }
        btn_pink.setOnClickListener{
            replaceFragment(PinkFragment())
        }
        btn_back.setOnClickListener {
            val intent = Intent(this@HomeActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    fun replaceFragment(Fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment, Fragment)
        fragmentTransaction.commit()
    }

}