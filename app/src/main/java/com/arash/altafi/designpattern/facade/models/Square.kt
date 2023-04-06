package com.arash.altafi.designpattern.facade.models

import android.util.Log
import com.arash.altafi.designpattern.facade.interfaces.Shape
import com.arash.altafi.designpattern.facade.FacadeActivity.Companion.TAG

class Square: Shape {

    var width = 0

    override fun draw() {
        Log.i(TAG, "draw Square")
    }

}