package rocha.felix.collections

fun main(){

    val salarios = doubleArrayOf(1000.0,4000.0,3000.0,2000.0)

    salarios.forEachIndexed{index,valor->
        println(valor)
    }


    println("==============================")
    println("Maior Salario: ${salarios.max()}")
    println("Menor salario ${salarios.min()}")
    println("Salario Medio: ${salarios.average()}")

    //Seleciona os maiores salarios de acordo com o filtro
    val salarioFiltro = salarios.filter { it > 2000.0 };
    println("==============================")
    salarioFiltro.forEach { println(it) }

    println("============RANGE==================")
    println(salarios.count{it in 1200.0..5000.0})
}