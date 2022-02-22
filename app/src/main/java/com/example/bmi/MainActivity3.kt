package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bmi.databinding.ActivityMain3Binding
import java.io.StringReader

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var back = binding.button2
        var btn = binding.button4
        var guy = binding.rdoGuy
        var girl = binding.rdoGirl
        var age = binding.editAge
        var height = binding.editTextNumber4
        var weight = binding.editTextNumber6
        var youheight = binding.youheight


        btn.setOnClickListener {
            if (guy.isChecked){

            }else if(girl.isChecked){

            }
        }

        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

}