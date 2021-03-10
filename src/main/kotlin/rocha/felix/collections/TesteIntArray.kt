package rocha.felix.collections

fun main(){
    val valorArray = IntArray(5)

    valorArray[0] = 3
    valorArray[1] = 7
    valorArray[2] = 73
    valorArray[3] = 45
    valorArray[4] = 13

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