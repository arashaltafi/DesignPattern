package com.arash.altafi.designpattern.factory

import com.arash.altafi.designpattern.factory.enums.ShapeEnum
import com.arash.altafi.designpattern.facade.interfaces.Shape
import com.arash.altafi.designpattern.facade.models.Circle
import com.arash.altafi.designpattern.facade.models.Rectangle
import com.arash.altafi.designpattern.facade.models.Square

object ShapeFactory {

    fun getShape(shape: ShapeEnum): Shape {
        return when (shape) {
            ShapeEnum.CIRCLE -> Circle()
            ShapeEnum.SQUARE -> Square()
            ShapeEnum.RECTANGLE -> Rectangle()
        }
    }

}