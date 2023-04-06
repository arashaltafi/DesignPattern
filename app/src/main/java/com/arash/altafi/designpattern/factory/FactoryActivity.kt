package com.arash.altafi.designpattern.factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.designpattern.R
import com.arash.altafi.designpattern.factory.enums.ShapeEnum
import com.arash.altafi.designpattern.factory.models.Circle
import com.arash.altafi.designpattern.factory.models.Rectangle
import com.arash.altafi.designpattern.factory.models.Square

class FactoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)

        /*Circle().apply {
            radius = 10
            draw()
        }
       Square().apply {
            width = 30
           draw()
        }
        Rectangle().apply {
            width = 20
            height = 15
            draw()
        }*/

//        IN FACTORY ====>>>>

        ShapeFactory.getShape(ShapeEnum.CIRCLE).apply {
            (this as Circle).radius = 10
            draw()
        }
        ShapeFactory.getShape(ShapeEnum.SQUARE).apply {
            (this as Square).width = 30
            draw()
        }
        ShapeFactory.getShape(ShapeEnum.RECTANGLE).apply {
            (this as Rectangle).width = 20
            (this as Rectangle).height = 15
            draw()
        }

    }
}