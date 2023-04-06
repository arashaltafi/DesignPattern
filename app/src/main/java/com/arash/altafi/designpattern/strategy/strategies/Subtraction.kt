package com.arash.altafi.designpattern.strategy.strategies

import com.example.patterns.strategypattern.strategyinterface.Strategy

class Subtraction: Strategy {

    private var num1: Int? = null
    private var num2: Int? = null

    override fun doOperation(num1: Int, num2: Int): Int {
        this.num1 = num1
        this.num2 = num2
        return num1 - num2
    }
}