package com.arash.altafi.designpattern.builder

import com.arash.altafi.designpattern.builder.models.Pizza

class PizzaBuilder {

    private var pizza: Pizza = Pizza()

    fun setName(name: String): PizzaBuilder {
        pizza.name = name
        return this
    }

    fun addSauce(): PizzaBuilder {
        pizza.sauce = true
        return this
    }

    fun addPeppery(): PizzaBuilder {
        pizza.spicy = true
        return this
    }

    fun addCheese(): PizzaBuilder {
        pizza.cheese = true
        return this
    }

    fun brake() = pizza

}