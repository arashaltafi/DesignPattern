package com.arash.altafi.designpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arash.altafi.designpattern.adapter.players.MainAudioPlayer
import com.arash.altafi.designpattern.builder.BuilderActivity
import com.arash.altafi.designpattern.databinding.ActivityMainBinding
import com.arash.altafi.designpattern.facade.FacadeActivity
import com.arash.altafi.designpattern.factory.FactoryActivity
import com.arash.altafi.designpattern.singleTon.SingleTonActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainAudioPlayer = MainAudioPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() = binding.apply {
        //Factory Pattern: This pattern creates objects without exposing the instantiation logic to the client and allows the class to defer the instantiation to subclasses.
        btnFactory.setOnClickListener {
            startActivity(Intent(this@MainActivity, FactoryActivity::class.java))
        }

        //Singleton Pattern: This pattern ensures that only one instance of a class exists in the system and provides a global point of access to that instance.
        btnSingleTon.setOnClickListener {
            startActivity(Intent(this@MainActivity, SingleTonActivity::class.java))
        }

        //Builder Pattern: This pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
        btnBuilder.setOnClickListener {
            startActivity(Intent(this@MainActivity, BuilderActivity::class.java))
        }

        //Facade Pattern: This pattern provides a unified interface to a set of interfaces in a subsystem, making the subsystem easier to use and reducing the complexity of the overall system.
        btnFacade.setOnClickListener {
            startActivity(Intent(this@MainActivity, FacadeActivity::class.java))
        }

        //Adapter Pattern: This pattern converts the interface of a class into another interface the client expects, allowing classes with incompatible interfaces to work together.
        btnAdapter.setOnClickListener {
            mainAudioPlayer.play("mp4", "test_file_name")
            Toast.makeText(
                this@MainActivity,
                "See LogCat With TAG = AdapterDesignPattern",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}