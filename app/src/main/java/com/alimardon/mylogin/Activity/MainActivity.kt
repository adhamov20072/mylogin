package com.alimardon.mylogin.Activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alimardon.mylogin.R
import com.alimardon.mylogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            if (binding.edit1.text == null) {
                binding.edit1.hint = "Enter Email!"
                binding.edit1.setHintTextColor(R.color.red)
            }
            if (binding.edit2.text == null) {
                binding.edit2.hint = "Enter Password!"
                binding.edit2.setHintTextColor(R.color.red)
            }
            else {
                startActivity(Intent(this, MainActivity2::class.java))
                finish()
            }
        }
    }
}