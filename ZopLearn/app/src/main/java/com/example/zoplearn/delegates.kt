package com.example.zoplearn

import kotlin.properties.Delegates
import kotlin.lazy as lazy1

interface base{
    fun print()
}

class baseImplemented(val x: Int): base{
    override fun print(){
        println("1 $x")
    }
}

class baseImplemented2(val x: Int): base{
    override fun print(){
        println("2 $x")
    }
}

class Derived(b: base) : base by b

fun main()
{
    val b = baseImplemented2(15)
    Derived(b).print()

    val num: Int by lazy1 {
        5
    }
    println(num)

    val lazyValue: String by lazy1()
    {
        // Printing to standard output
        println("print default")
        "hello"
    }

    println(lazyValue)

    var n1: Int by Delegates.observable(10){
        property, oldValue, newValue ->
        println("oldValue was: $oldValue")
        println("newValue is : $newValue")
    }
    n1 = 5
}
