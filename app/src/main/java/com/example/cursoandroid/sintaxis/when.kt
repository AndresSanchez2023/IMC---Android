package com.example.cursoandroid.sintaxis

fun main(){
    getSemestre(2)
}

fun getMonth(month: Int){
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> {
            println("noviembre")
            println("Noviembre")
        }
        12 -> println("diciembre")
        else -> print("No es un mes valido")
    }
}

fun getTrimester (month:Int){
    when(month){
        1,2,3 -> println("Primer trimestre")
        4,5,6 -> println("Segundo Trimestre")
        7,8,9 -> println("Tercer Trimestre")
        10,11,12 -> println("Cuarto Trimestre")
        else -> print("No es un mes valido")
    }
}

fun getSemestre (month: Int)=
     when(month) {
        in 1..6 ->  "Primer Semestre"
        in 7..12 ->  "Segundo Semestre"
        !in 1..12 -> "Semestre invalido"
        else -> "dark"
}

fun result(value:Any){
    when(value){
        is Int -> value+value
        is Boolean -> if(value) print("Holiwi")
    }
}