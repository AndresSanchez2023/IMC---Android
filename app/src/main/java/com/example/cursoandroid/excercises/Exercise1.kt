package com.example.cursoandroid.excercises

fun main (){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages:Int) {
    if(numberOfMessages<0){
        println("El numero de notificaciones no puede ser menor que cero")
    }else{
        when(numberOfMessages){
            in 0..99 -> println("You have $numberOfMessages notifications")
            in 100..Int.MAX_VALUE -> println("Your phone is blowing up! You have 99+ notifications")
        }
    }
}
