package rocha.felix.collections

fun main(){
    val joao = Funcionarios("João", 678.90,"CLT")
    val pedro = Funcionarios("Pedro", 6000.90,"Autonomo")
    val maria = Funcionarios("Maria", 6000.90,"Autonomo")
    val fernanda = Funcionarios("Paula", 6000.90,"Autonomo")
    val larissa = Funcionarios("Larissa", 1500.90,"CLT")
    val vanessa = Funcionarios("Vanessa", 1500.90,"CLT")
    val joana = Funcionarios("Joana", 1500.90,"CLT")

    val listFuncionario_1 = setOf(maria,pedro)
    val listFuncionario_2 = setOf(maria)

    val listFuncionarioUnion = listFuncionario_1.union(listFuncionario_2)

    println("===============UNION============")
    listFuncionarioUnion.forEach { println(it) }


    println("===============SUBTRACT============")
    val listFuncionario_3 = setOf(joao,pedro,maria)
    val listFuncionarioSubtract = listFuncionario_3.subtract(listFuncionario_2)

    listFuncionarioSubtract.forEach { println(it) }

    println("===============INTERSECT============")
    val listFuncionarioIntersect = listFuncionario_3.intersect(listFuncionario_2)

    listFuncionarioIntersect.forEach { println(it) }


}