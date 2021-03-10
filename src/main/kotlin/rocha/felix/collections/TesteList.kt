package rocha.felix.collections

fun main() {
    val maria = Funcionarios("Maria", 678.90,"CLT")
    val felix = Funcionarios("Felix", 6000.90,"Autonomo")
    val larissa = Funcionarios("Larissa", 1500.90,"CLT")
    val vanessa = Funcionarios("Vanessa", 1500.90,"CLT")
    val joana = Funcionarios("Joana", 1500.90,"CLT")

    val listFuncionarios = listOf(maria, felix, larissa,vanessa)

    listFuncionarios.forEach { println(it) }

    println("================FIND=====================")

    println(listFuncionarios.find { it.nome == "Larissa" })

    println("================SORTBY=====================")
    listFuncionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("================GROUPBY=====================")
    listFuncionarios
        .groupBy { it.tipo }
        .forEach{ println(it)}

}

data class Funcionarios(
    val nome :String,
    val salario :Double,
    val tipo :String
){
    override fun toString(): String  = """
        Nome:    $nome
        Salario: $salario
    """.trimIndent()
}