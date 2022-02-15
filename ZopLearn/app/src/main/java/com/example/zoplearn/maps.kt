package com.example.zoplearn

fun main(){
    val mapNameAge = mutableMapOf<String, Int>("sahej" to 22)
    println(mapNameAge)

    mapNameAge.put("rohit", 20)

    println(mapNameAge["sahej"])

    print("count of keys with value greater than 21: ")
    println(mapNameAge.count{
        it.value > 21
    })
    println(mapNameAge.filter {
        it.value > 21
    })
}