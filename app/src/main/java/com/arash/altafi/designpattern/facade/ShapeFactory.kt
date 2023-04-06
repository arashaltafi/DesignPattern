package com.arash.altafi.designpattern.facade

import com.arash.altafi.designpattern.facade.models.Circle
import com.arash.altafi.designpattern.facade.models.Rectangle
import com.arash.altafi.designpattern.facade.models.Square

class ShapeFactory {

    private val circle = Circle()
    private val square = Square()
    private val rectangle = Rectangle()

    fun getRectangle() = rectangle
    fun getSquare() = square
    fun getCircle() = circle

}