package com.arash.altafi.designpattern.facade.models

import android.util.Log
import com.arash.altafi.designpattern.facade.interfaces.Shape

class Square : Shape {

    var width = 0

    override fun draw() {
        Log.i("FacadePattern", "draw Square")
    }

}