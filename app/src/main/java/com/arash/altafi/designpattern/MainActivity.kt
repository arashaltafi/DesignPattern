package com.arash.altafi.designpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.arash.altafi.designpattern.adapter.players.MainAudioPlayer
import com.arash.altafi.designpattern.builder.BuilderActivity
import com.arash.altafi.designpattern.databinding.ActivityMainBinding
import com.arash.altafi.designpattern.facade.FacadeActivity
import com.arash.altafi.designpattern.factory.FactoryActivity
import com.arash.altafi.designpattern.singleTon.SingleTonActivity
import com.arash.altafi.designpattern.strategy.baseclass.Calculate
import com.arash.altafi.designpattern.strategy.strategies.Multiplication
import com.arash.altafi.designpattern.strategy.strategies.Subtraction
import com.arash.altafi.designpattern.strategy.strategies.Summation
import com.arash.altafi.designpattern.visitor.impl.ShoppingCardImpl
import com.arash.altafi.designpattern.visitor.items.Book
import com.arash.altafi.designpattern.visitor.items.Fruit

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
            Toast.makeText(
                this@MainActivity,
                "See LogCat With TAG = FactoryPattern",
                Toast.LENGTH_SHORT
            ).show()
            startActivity(Intent(this@MainActivity, FactoryActivity::class.java))
        }

        //Singleton Pattern: This pattern ensures that only one instance of a class exists in the system and provides a global point of access to that instance.
        btnSingleTon.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "See LogCat With TAG = SingleTonPattern",
                Toast.LENGTH_SHORT
            ).show()
            startActivity(Intent(this@MainActivity, SingleTonActivity::class.java))
        }

        //Builder Pattern: This pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
        btnBuilder.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "See LogCat With TAG = BuilderPattern",
                Toast.LENGTH_SHORT
            ).show()
            startActivity(Intent(this@MainActivity, BuilderActivity::class.java))
        }

        //Facade Pattern: This pattern provides a unified interface to a set of interfaces in a subsystem, making the subsystem easier to use and reducing the complexity of the overall system.
        btnFacade.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "See LogCat With TAG = FacadePattern",
                Toast.LENGTH_SHORT
            ).show()
            startActivity(Intent(this@MainActivity, FacadeActivity::class.java))
        }

        //Adapter Pattern: This pattern converts the interface of a class into another interface the client expects, allowing classes with incompatible interfaces to work together.
        btnAdapter.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "See LogCat With TAG = AdapterPattern",
                Toast.LENGTH_SHORT
            ).show()
            mainAudioPlayer.play("mp4", "test_file_name")
        }

        //Visitor Pattern: This pattern allows adding new operations to an object structure without modifying the objects themselves. It separates the algorithm from the object structure on which it operates, making it easier to add new operations.
        btnVisitor.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "See LogCat With TAG = VisitorPattern",
                Toast.LENGTH_SHORT
            ).show()
            visitorPattern()
        }

        //Strategy Pattern: This pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from the clients that use it.
        btnStrategy.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "See LogCat With TAG = StrategyPattern",
                Toast.LENGTH_SHORT
            ).show()
            strategyPattern()
        }
    }

    private fun strategyPattern() {
        val result = Calculate(10, 5).executeCalculation(Summation())
        Log.v("StrategyPattern", result.toString())

        val result2 = Calculate(10, 5).executeCalculation(Subtraction())
        Log.v("StrategyPattern", result2.toString())

        val result3 = Calculate(10, 5).executeCalculation(Multiplication())
        Log.v("StrategyPattern", result3.toString())
    }

    private fun visitorPattern() {
        val items = arrayOf(
            Book(404.0, 1234),
            Book(16.5, 4567),
            Fruit(1.2, "Strawberry", 3.5),
            Fruit(5.0, "Watermelon", 10.0)
        )

        var sum = 0.0

        for (i in items) {
            sum += i.accept(ShoppingCardImpl())!!
        }

        Log.v("VisitorPattern", "Total cost: $sum")
    }

}