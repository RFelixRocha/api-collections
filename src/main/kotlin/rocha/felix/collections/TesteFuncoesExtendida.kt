package rocha.felix.collections

fun main(){
    val salarios = arrayOf("100".toBigDecimal(),"200".toBigDecimal(),"300".toBigDecimal(),"400".toBigDecimal(),"500".toBigDecimal())

    println("==========somatoria===============")
    println(salarios.somatoria())

    println("==========media===============")
    println(salarios.media())
}