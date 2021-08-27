package `exercício_2021-08-23`

import java.util.*
import java.util.Calendar.*

fun cabecalhoDoComprovante():String
{
    println("OI")
    return "##########DH SuperMarket##########"
}

val dataDaCompra: () -> String = {
    var dataAtual = Calendar.getInstance()
    "${dataAtual.get(DATE)}/${dataAtual.get(MONTH)}/${dataAtual.get(YEAR)}"
}

val imprimeListaDeCompra: (List<Produto>) -> Unit = { lista: List<Produto> ->
    for (item in lista) {
        println(item)
    }
}

fun imprimeListaDeCompra(lista: List<String>)
{
    for (item in lista) {
        println(item)
    }
}

val adicionaRodape: (List<Produto>) -> Unit = { lista: List<Produto> ->
    var totalCompras: Double = 0.0
    for (item in lista) {
        println("${item.nome}: R$ ${item.preco}")
        totalCompras += item.preco
    }
    println("Total: ${totalCompras}")
}