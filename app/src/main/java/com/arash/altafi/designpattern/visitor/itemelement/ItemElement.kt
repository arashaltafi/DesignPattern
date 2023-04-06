package com.arash.altafi.designpattern.visitor.itemelement

import com.arash.altafi.designpattern.visitor.visitor.IShoppingCardVisitor

interface ItemElement {
    fun accept(visitor: IShoppingCardVisitor) : Double?
}