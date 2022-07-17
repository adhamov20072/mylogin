package com.alimardon.mylogin.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alimardon.mylogin.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding:ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val text1 = binding.edit1.text.toString()
        val text3 = binding.edit3.text.toString()
        binding.btnback.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        binding.changeButton.setOnClickListener {

            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("text1",text1)
            intent.putExtra("text3",text3)
            startActivity(intent)
        }
    }
}