package com.arash.altafi.designpattern.visitor.items

import com.arash.altafi.designpattern.visitor.visitor.IShoppingCardVisitor
import com.arash.altafi.designpattern.visitor.itemelement.ItemElement

class Fruit(pricePerWeight: Double?, name: String?, weight: Double?) : ItemElement {

    private var pricePerWeight: Double? = null
    private var name: String? = null
    private var weight: Double? = null

    init {
        this.pricePerWeight = pricePerWeight
        this.name = name
        this.weight = weight
    }

    fun getFruitPrice(): Double? = pricePerWeight

    fun getFruitName(): String? = name

    fun getFruitWeight(): Double? = weight

    override fun accept(visitor: IShoppingCardVisitor): Double? {
        return visitor.visit(this)
    }

}
