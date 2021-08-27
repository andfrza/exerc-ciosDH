package `exercicio_2021-08-13`

class IngressoVIP : Ingresso() {
    override fun imprimeValor() {
        println("Ingresso VIP: ${valor + 10}")
    }
}