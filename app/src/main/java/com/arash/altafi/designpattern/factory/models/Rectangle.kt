package com.arash.altafi.designpattern.factory.models

import android.util.Log
import com.arash.altafi.designpattern.factory.interfaces.Shape

class Rectangle : Shape {

    var width = 0
    var height = 0

    override fun draw() {
        Log.i("FactoryPattern", "draw Rectangle")
    }

}