package com.arash.altafi.designpattern.visitor.items

import com.arash.altafi.designpattern.visitor.visitor.IShoppingCardVisitor
import com.arash.altafi.designpattern.visitor.itemelement.ItemElement

class Book(price: Double?, isbnNumber: Int?) : ItemElement {

    private var price: Double? = null
    private var isbnNumber: Int? = null

    init {
        this.price = price
        this.isbnNumber = isbnNumber
    }

    fun getBookPrice(): Double? = price

    fun getIsbnNumber(): Int? = isbnNumber

    override fun accept(visitor: IShoppingCardVisitor): Double? {
        return visitor.visit(this)
    }

}
