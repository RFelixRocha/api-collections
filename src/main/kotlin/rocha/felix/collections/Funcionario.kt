package rocha.felix.collections

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