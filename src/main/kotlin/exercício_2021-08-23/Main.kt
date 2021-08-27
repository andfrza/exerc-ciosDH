package `exercício_2021-08-23`

fun main() {
    var carrinho=CarrinhoDeCompras()
    carrinho.adicionaCarrinho(Produto("Xampu", 12.5))
    carrinho.adicionaCarrinho(Produto("Sabonete",4.75))
    carrinho.adicionaCarrinho(Produto("Pasta de dente",10.0))
    var caixa=Caixa()
    println(caixa.fechamentoDeConta(cabecalhoDoComprovante={ cabecalhoDoComprovante() }))
}