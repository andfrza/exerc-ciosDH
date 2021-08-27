package classes.`exercicio_2021-08-09`

class Item(var numeroDoItem: Int, var descricao: String, var quantidadeComprada: Int, var precoUnitario: Double) {
    init {//caso os valores sejam negativos
        if (quantidadeComprada < 0) {
            quantidadeComprada = 0
        }
        if (precoUnitario < 0.0) {
            precoUnitario = 0.0
        }
    }
}
class Fatura(var produto: List<Item>) {//essa lista permanece com o "tipo" como nome da classe
    var total = 0.0
    fun totalDaFatura(): Double {
        for (item in produto) {
            total += item.quantidadeComprada * item.precoUnitario
            println(item.descricao+item.numeroDoItem)
        }
        return total
    }
}
fun main() {
    val listaDeProdutos = listOf<Item>(
        Item(1, "bom", 1, 4.50),
        Item(2, "melhor", 2, 7.50)
    )//nossa variável (cada item na lista é uma classe personalizada)
    val fatura = Fatura(listaDeProdutos)//personalizo a classe Fatura com esses valores
    val resultado = fatura.totalDaFatura()//acesso a função na minha variável personalizada
    println(resultado)
}
