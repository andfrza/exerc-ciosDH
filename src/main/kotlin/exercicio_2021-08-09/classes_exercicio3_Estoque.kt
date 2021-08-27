package `exercicio_2021-08-09`

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {
    init {
        if (qtdAtual < 0) {
            qtdAtual = 0
        }
        if (qtdMinima < 0) {
            qtdMinima = 0
        }
    }

    fun mudarNome() {

    }

    fun mudarQtdMinima() {

    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        qtdAtual -= qtd
    }

    fun mostra(): Unit {
        println("$nome, $qtdMinima, $qtdAtual")
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }
}