package com.example.cursoandroid.sintaxis

fun main (){
    println("hola")
    showMyAge(30)
}

fun showMyAge(currentAge: Int){
    println("Tengo $currentAge años")
}

fun add (firtsNumber:Int, secondNumber: Int){
    print(firtsNumber + secondNumber)
}

fun subtract (firtsNumber: Int, secondNumber: Int):Int {
    return firtsNumber - secondNumber
}

fun suma (numero1: Int, numero2: Int):Int {
    return numero1 + numero2;
}

fun subtract2(firstNumber: Int, secondNumber: Int) = firstNumber -secondNumber