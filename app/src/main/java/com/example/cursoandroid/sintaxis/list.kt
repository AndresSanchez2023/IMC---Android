package com.example.cursoandroid.sintaxis

fun main (){
    //inmutableList()
    mutableList()
}

fun mutableList() {
    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    //añadimos un nuevo valor al inicio de la lista
    weekDays.add(0,"AristiDay")
    println(weekDays)

    if(weekDays.isEmpty()){
        //la lista es vacia
    }else{
        weekDays.forEach{ println(it) }
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach{ println(it) }
    }

    weekDays.last()

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
    //println(readOnly.last())
    //println(readOnly.first())

    //filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //las siguientes lineas hacen lo mismo
    readOnly.forEach { println(it) }
    readOnly.forEach {weekDay -> println(weekDay) }
}