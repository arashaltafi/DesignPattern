package com.arash.altafi.designpattern.factory.models

import android.util.Log
import com.arash.altafi.designpattern.factory.interfaces.Shape

class Circle : Shape {

    var radius = 0

    override fun draw() {
        Log.i("FactoryPattern", "draw Circle")
    }

}