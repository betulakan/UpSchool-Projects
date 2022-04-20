package com.example.myapplication

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

class PremiumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premium)

        val monthlyString: TextView = findViewById(R.id.monthlyTextView)
        val yearlyString: TextView = findViewById(R.id.yearlyTextView)

        val tv1 : TextView=findViewById(R.id.textView6)
        val tv2 : TextView=findViewById(R.id.textView9)
        val tv3 : TextView=findViewById(R.id.textView10)
        val tv4 : TextView=findViewById(R.id.textView11)

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



        tv1.text = spannableString1
        tv2.text = spannableString2
        tv3.text = spannableString3
        tv4.text = spannableString4

        /*
        val spannableString = SpannableStringBuilder()
            .bold{scale(proportion = 1.5f) {append("$11.99\n")} }
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.darker)){append("$11.99 ")}}
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.dark)){append("per month\n")}}
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.darker)){append("$143.99 ")}}
            .bold{color(ContextCompat.getColor(this@PremiumActivity,R.color.dark)){append("per year")}}

        monthlyString.text = spannableString

        yearlyString.text = ("$4.99\n $4.99 per month\n $59.99 per year")*/
    }
}