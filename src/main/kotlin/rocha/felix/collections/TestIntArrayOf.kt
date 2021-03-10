package rocha.felix.collections

fun main(){
    val valorArray = intArrayOf(10,344,2,34,556,77)

    for (value in valorArray){
        println(value)
    }

    println("====================================")

    valorArray.forEach {
        println(it)
    }


    println("====================================")

    for(index in valorArray.indices){
        println(valorArray[index])
    }

    println("====================================")

    valorArray.sort()
    for(valor in valorArray){
        println(valor)
    }
}