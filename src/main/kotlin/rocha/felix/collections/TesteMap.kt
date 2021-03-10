package rocha.felix.collections

fun main(){
    val pair: Pair<String, Double> = Pair("João",1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (t, u) -> println("Chave: $t - valor: $u") }
    println("==============================")
    val map2 = mapOf("Maria" to 350.0,"Fernanda" to 1350.0)
    map2.forEach { (t, u) -> println("Chave: $t - valor: $u") }
}