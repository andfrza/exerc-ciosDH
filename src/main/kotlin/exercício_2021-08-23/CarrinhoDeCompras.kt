package `exercício_2021-08-23`


class CarrinhoDeCompras() {
    var listaGlobal=ArrayList<Produto>()
    fun adicionaCarrinho(novoProduto: Produto) {
        listaGlobal.add(novoProduto)
    }
}