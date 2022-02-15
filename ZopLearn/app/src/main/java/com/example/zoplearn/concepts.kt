package com.example.zoplearn

class Employee{
    var FirstName: String? = null
    var LastName: String? = null
    var age: Int = 0
}

fun Employee.print_formatted_name(){
    println("$FirstName, $LastName")
}

fun calc(a:Int, b:Int, function_as_parameter: (Int, Int) -> Int): Int{
    return function_as_parameter(a,b)
}

fun sum(x: Int, y: Int) = x + y
fun multiply(x: Int, y:Int) = x*y
fun divide(x: Int, y: Int) = x/y

inline fun print_years_till_2100(a: Int, fn: (Int) -> Int){
    var total_years = fn(a)
    println("$total_years till the year 2100")
}

fun main(){
    val emp = Employee()
    emp.FirstName = "Sahej"
    emp.LastName = "Singh"

    println(emp.print_formatted_name())

    val lambda_sum : (Int, Int) -> Int = {it1, it2 ->
        it1 * it2
    }
    println(lambda_sum(10,5))
    println(calc(10, 20) {a,b -> a*b})

    print_years_till_2100(2022) { a -> 2100 - a }
}