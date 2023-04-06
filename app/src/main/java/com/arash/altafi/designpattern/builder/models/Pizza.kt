package com.arash.altafi.designpattern.builder.models

class Pizza {
    var name: String = ""
    var spicy: Boolean = false
    var sauce: Boolean = false
    var cheese: Boolean = false

    override fun toString(): String {
        return "Pizza(name='$name', spicy=$spicy, sauce=$sauce, cheese=$cheese)"
    }

}