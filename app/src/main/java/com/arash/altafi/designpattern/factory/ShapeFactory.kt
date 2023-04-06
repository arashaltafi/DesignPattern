package com.arash.altafi.designpattern.factory

import com.arash.altafi.designpattern.factory.enums.ShapeEnum
import com.arash.altafi.designpattern.factory.interfaces.Shape
import com.arash.altafi.designpattern.factory.models.Circle
import com.arash.altafi.designpattern.factory.models.Rectangle
import com.arash.altafi.designpattern.factory.models.Square

object ShapeFactory {

    fun getShape(shape: ShapeEnum): Shape {
        return when (shape) {
            ShapeEnum.CIRCLE -> Circle()
            ShapeEnum.SQUARE -> Square()
            ShapeEnum.RECTANGLE -> Rectangle()
        }
    }

}