package com.arash.altafi.designpattern.facade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.designpattern.R

class FacadeActivity : AppCompatActivity() {

    companion object {
        const val TAG = "FacadeActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facade)

        val facade = ShapeFactory()

        facade.getRectangle().apply {
            width = 20
            height = 15
            draw()
        }

        facade.getCircle().apply {
            radius = 30
            draw()
        }

        facade.getSquare().apply {
            width = 10
            draw()
        }
    }
}