package `exercício_2021-08-25 (Collections)`

fun somaTotal(conjunto:MutableSet<Int>){
    var somaTotal:Int=0
    for (item in conjunto){
        somaTotal+=item
    }
    println(somaTotal)
}
fun main() {
    var listaDeNumeros=mutableSetOf<Int>(1,2,3,3,4)
    somaTotal(listaDeNumeros)
}