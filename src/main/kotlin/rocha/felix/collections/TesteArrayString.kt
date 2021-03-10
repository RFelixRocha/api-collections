package rocha.felix.collections

fun main(){
    var nomeArray = Array(3){""}
    nomeArray[0] = "Felix"
    nomeArray[1] = "Rocha"
    nomeArray[2] = "Larissa"

    for (value in nomeArray){
        println(value)
    }

    nomeArray.sort()

    println("====================================")
    nomeArray.forEach {
        println(it)
    }
    println("====================================")
    val nomeArray2 = arrayOf("Fernando","Larissa","Felix")

    nomeArray2.sort()
    nomeArray2.forEach { println(it) }
}