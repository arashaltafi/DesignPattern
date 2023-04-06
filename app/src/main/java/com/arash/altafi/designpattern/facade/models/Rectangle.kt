package com.arash.altafi.designpattern.facade.models

import android.util.Log
import com.arash.altafi.designpattern.facade.FacadeActivity.Companion.TAG
import com.arash.altafi.designpattern.facade.interfaces.Shape

class Rectangle: Shape {

    var width = 0
    var height = 0

    override fun draw() {
        Log.i(TAG, "draw Rectangle")
    }

}