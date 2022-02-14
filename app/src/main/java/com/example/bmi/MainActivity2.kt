package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.bmi.databinding.ActivityMain2Binding
import java.io.Serializable
import kotlin.math.round

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var edt2 = binding.editTextNumber2
        var edt3 = binding.editTextNumber3
        var bmitext = binding.bmitext
        var btnbmi = binding.btnBmi


        btnbmi.setOnClickListener {
            var bmi:Double =  10000 * (edt3.text.toString().toDouble() /  Math.pow(edt2.text.toString().toDouble() ,2.0))
            var bmi1 = round(bmi)
            bmitext.text = bmi1.toString()
        }


    }

}