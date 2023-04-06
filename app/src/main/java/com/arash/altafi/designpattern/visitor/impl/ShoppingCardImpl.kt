package com.arash.altafi.designpattern.visitor.impl

import android.util.Log
import com.arash.altafi.designpattern.visitor.items.Book
import com.arash.altafi.designpattern.visitor.items.Fruit
import com.arash.altafi.designpattern.visitor.visitor.IShoppingCardVisitor

class ShoppingCardImpl : IShoppingCardVisitor {

    override fun visit(book: Book): Double {
        Log.v(
            "visitorPatternResult",
            "Book ISBN: ${book.getIsbnNumber()}, Book Cost: ${book.getBookPrice()}"
        )

        return if (book.getBookPrice()!! > 50)
            (book.getBookPrice()!! - 5)
        else
            book.getBookPrice()!!
    }

    override fun visit(fruit: Fruit): Double {
        val fruitCost = fruit.getFruitPrice()!! * fruit.getFruitWeight()!!
        Log.v("visitorPatternResult", "${fruit.getFruitName()} Cost: $fruitCost")

        return fruitCost
    }
}