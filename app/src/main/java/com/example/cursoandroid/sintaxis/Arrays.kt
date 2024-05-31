package com.example.cursoandroid.sintaxis

fun main (){
    val weekdays = arrayOf("lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekdays)
    for(position in weekdays.indices){
        println(weekdays.get(position))
    }

    for((position, value) in weekdays.withIndex()){
        println("La posicion $position contiene $value")
    }

    for (weekday in weekdays){
        println("ahora es $weekday")
    }
}