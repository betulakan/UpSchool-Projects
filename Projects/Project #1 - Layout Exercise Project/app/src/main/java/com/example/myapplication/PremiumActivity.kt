package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.text.bold
import androidx.core.text.color
import androidx.core.text.scale
import android.graphics.Color.parseColor
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityPremiumBinding

class PremiumActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPremiumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_premium)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_premium)


        val spannableString1 = SpannableStringBuilder()
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.darker)){append("$11.99 ")}}
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.dark)){append("per month")}}

        val spannableString2 = SpannableStringBuilder()
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.darker)){append("$143.99 ")}}
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.dark)){append("per year")}}

        val spannableString3 = SpannableStringBuilder()
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.darker)){append("$4.99 ")}}
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.dark)){append("per month")}}

        val spannableString4 = SpannableStringBuilder()
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.darker)){append("$59.99 ")}}
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.dark)){append("per year")}}


        binding.textView6.text = spannableString1;
        binding.textView9.text = spannableString2;
        binding.textView10.text = spannableString3;
        binding.textView11.text = spannableString4;
        init()
    }

    private fun init(){
        binding.button2.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            binding.button2.id->{
                //click listener
                startActivity(Intent(this@PremiumActivity, MainActivity::class.java))
            }
        }
    }
}