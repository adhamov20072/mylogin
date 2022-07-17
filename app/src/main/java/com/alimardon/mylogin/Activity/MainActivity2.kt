package com.alimardon.mylogin.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alimardon.mylogin.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val kelgan=intent.extras?.getString("text1")
        val kelgan2=intent.extras?.getString("text3")
        binding.jonathan.text=kelgan
        binding.gmg.text=kelgan2
        binding.profileChangePencil.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}