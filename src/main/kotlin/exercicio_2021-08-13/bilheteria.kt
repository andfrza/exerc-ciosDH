package `exercicio_2021-08-13`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Escolha o tipo de ingresso que deseja: 1 - Padrão e 2 - VIP".trimIndent())
    var retornoInicial = scanner.nextInt()
    if (retornoInicial == 1) {
        var resposta=IngressoPadrao()
        resposta.imprimeValor()
    } else {
        var resposta=IngressoVIP()
        resposta.imprimeValor()
    }
}