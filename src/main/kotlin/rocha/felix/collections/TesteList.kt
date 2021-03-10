package rocha.felix.collections

fun main() {
    val maria = Funcionarios("Maria", 678.90)
    val felix = Funcionarios("Felix", 6000.90)
    val larissa = Funcionarios("Larissa", 1500.90)

    val listFuncionarios = listOf(maria, felix, larissa)

    listFuncionarios.forEach { println(it) }

    println("================FIND=====================")

    println(listFuncionarios.find { it.nome == "Larissa" })

    println("================SORTBY=====================")
    listFuncionarios.sortedBy { it.salario }.forEach { println(it) }
}

data class Funcionarios(
    val nome :String,
    val salario :Double
){
    override fun toString(): String  = """
        Nome:    $nome
        Salario: $salario
    """.trimIndent()
}