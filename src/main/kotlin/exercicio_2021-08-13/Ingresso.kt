package `exercicio_2021-08-13`

abstract class Ingresso() {
    var valor: Float = 10.50f
    open fun imprimeValor() {
        println("Ingresso Padrão: ${valor}")
    }
}