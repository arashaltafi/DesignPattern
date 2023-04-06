package com.arash.altafi.designpattern.factory.models

import android.util.Log
import com.arash.altafi.designpattern.factory.FactoryActivity.Companion.TAG
import com.arash.altafi.designpattern.facade.interfaces.Shape

class Circle: Shape {

    var radius = 0

    override fun draw() {
        Log.i(TAG, "draw Circle")
    }

}