package rocha.felix.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    for (value in salarios){
        println(value)
    }

    salarios.sort()

    println("====================================")
    salarios.forEach {
        println(it)
    }
    println("====================================")

    salarios.forEachIndexed { index, valor ->
        salarios[index] = valor *1.1
    }

    salarios.forEach {
        println(it)
    }

    val salariosBonus = doubleArrayOf(500.50,56.78,342.45,1000.67)

    salariosBonus.sort();
    println("====================================")

    salariosBonus.forEach { println(it) }
}