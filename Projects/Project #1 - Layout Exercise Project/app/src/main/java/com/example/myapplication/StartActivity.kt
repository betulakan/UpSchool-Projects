package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start)
        init()
    }

    private fun init(){
        binding.startButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            binding.startButton.id->{
                //click listener
                startActivity(Intent(this@StartActivity, PremiumActivity::class.java))
            }
        }
    }

}