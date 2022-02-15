package com.example.zoplearn

class rectangle(
    var length: Int,
    var width: Int,
    var color: String
){
    fun getData(){
        println(this.length)
        println(this.width)
        println(this.color)
    }
}

fun main(){
    val rect_obj = rectangle(20, 10, "blue")

    rect_obj.let{
        it.length = 40
        it.width = 20
        it.color = "red"
        it.getData()
        it
    }

    rect_obj.run{
        length = 80
        width = 40
        color = "white"
        getData()
    }

    with(rect_obj){
        length = 160
        width = 80
        color = "blue"
        getData()
    }

    rect_obj.apply {
        length = 320
        width = 160
        color = "black"
        getData()
    }

    rect_obj.also {
        it.length = 640
        it.width = 320
        it.color = "green"
        it.getData()
    }

}