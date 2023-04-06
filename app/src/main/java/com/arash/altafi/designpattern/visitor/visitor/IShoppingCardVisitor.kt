package com.arash.altafi.designpattern.visitor.visitor

import com.arash.altafi.designpattern.visitor.items.Book
import com.arash.altafi.designpattern.visitor.items.Fruit

interface IShoppingCardVisitor {
    fun visit(book: Book) : Double?
    fun visit(fruit: Fruit) : Double?
}