package `exercicio_2021-08-18`

fun main() {
    var pessoa1=Pessoa("Ayrton",123)
    var pessoa2=Pessoa("Lewis",123)
    println(pessoa1==pessoa2)
    println(pessoa1.toString())
    println(pessoa1.hashCode())
}