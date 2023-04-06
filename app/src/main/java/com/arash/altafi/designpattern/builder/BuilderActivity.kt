package com.arash.altafi.designpattern.builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.arash.altafi.designpattern.R

class BuilderActivity : AppCompatActivity() {

    private companion object {
        const val TAG = "BuilderPattern"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder)

        val peperoni = PizzaBuilder()
            .setName("peperoni")
            .addCheese()
            .addSauce()
            .addPeppery()
            .brake()
        Log.i(TAG, "peperoni: $peperoni")


        val pizza = PizzaBuilder()
            .setName("pizza")
            .addSauce()
            .brake()
        Log.i(TAG, "pizza: $pizza")

    }
}