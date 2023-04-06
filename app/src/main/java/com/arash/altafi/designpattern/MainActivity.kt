package com.arash.altafi.designpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.designpattern.builder.BuilderActivity
import com.arash.altafi.designpattern.databinding.ActivityMainBinding
import com.arash.altafi.designpattern.facade.FacadeActivity
import com.arash.altafi.designpattern.factory.FactoryActivity
import com.arash.altafi.designpattern.singleTon.SingleTonActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() = binding.apply {
        btnFactory.setOnClickListener {
            startActivity(Intent(this@MainActivity, FactoryActivity::class.java))
        }
        btnSingleTon.setOnClickListener {
            startActivity(Intent(this@MainActivity, SingleTonActivity::class.java))
        }
        btnBuilder.setOnClickListener {
            startActivity(Intent(this@MainActivity, BuilderActivity::class.java))
        }
        btnFacade.setOnClickListener {
            startActivity(Intent(this@MainActivity, FacadeActivity::class.java))
        }
    }

}