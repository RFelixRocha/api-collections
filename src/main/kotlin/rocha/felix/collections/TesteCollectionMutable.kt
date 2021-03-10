package rocha.felix.collections

fun main(){
    val joao = Funcionarios("João", 678.90,"CLT")
    val pedro = Funcionarios("Pedro", 6000.90,"Autonomo")
    val maria = Funcionarios("Maria", 6000.90,"Autonomo")

    val listFuncionarios = mutableListOf(joao,maria)

    println("================MutableListOf===================")
    listFuncionarios.forEach { println(it) }

    println("================Add list===================")

    listFuncionarios.add(pedro)
    listFuncionarios.forEach { println(it) }


    println("================Remove list===================")

    listFuncionarios.remove(joao)
    listFuncionarios.forEach { println(it) }

    println("================MutableSetOf===================")
    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet.forEach { println(it) }

    println("================MutableSetOf ADD===================")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("================MutableSetOf REMOVE===================")
    funcionariosSet.remove(pedro)
    funcionariosSet.forEach { println(it) }
}