package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bmi.databinding.ActivityMain2Binding
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
        var text = binding.textView5
        var back = binding.button5

        btnbmi.setOnClickListener {

            var bmi:Double =  10000 * (edt3.text.toString().toDouble() /  Math.pow(edt2.text.toString().toDouble() ,2.0))
            var bmi1 = round(bmi)
            bmitext.text = bmi1.toString()

            if (bmi1 < 18.5){
                text.text = "低体重"
            }else if(bmi < 25.0){
                text.text = "普通体重"
            }else if (bmi < 30){
                text.text = "肥満１"
            }else if (bmi < 35){
                text.text = "肥満２"
            }else if (bmi < 40){
                text.text = "肥満３"
            }else{
                text.text = "肥満４"
            }
        }
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }

}