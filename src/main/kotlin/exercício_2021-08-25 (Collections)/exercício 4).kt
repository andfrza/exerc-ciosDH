package `exercício_2021-08-25 (Collections)`

fun main() {
    var listaInicial=mutableSetOf<Int>()
    var listaAdicional=setOf<Int>(1,5,5,6,7,8,8,8)
    listaInicial.addAll(listaAdicional)

    for (item in listaInicial){
        println(item)
    }

}
//Resposta: o set (conjunto) não permite repetição de valores, inserindo apenas um de cada.