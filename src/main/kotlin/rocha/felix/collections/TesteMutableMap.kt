package rocha.felix.collections

fun main(){

    val joao = Funcionarios("João", 678.90,"CLT")
    val pedro = Funcionarios("Pedro", 6000.90,"Autonomo")
    val maria = Funcionarios("Maria", 6000.90,"Autonomo")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome,joao)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome,maria)

    println("===========REPOSITORIO=============")
    println(repositorio.findById(joao.nome))

    println("===========REPOSITORIO GetAll=============")
    repositorio.findAll().forEach { println(it) }

    println("===========REPOSITORIO REMOVE=============")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }

}