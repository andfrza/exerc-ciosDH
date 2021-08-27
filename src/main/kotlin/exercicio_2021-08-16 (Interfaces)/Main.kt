package `exercicio_2021-08-16 (Interfaces)`

fun main() {
    var documento:Imprimivel = Documento()
    var foto:Imprimivel = Foto()
    var contrato:Imprimivel = Contrato()
    var impressora = Impressora()

    impressora.adicionaLista(documento.imprimir())
    impressora.adicionaLista(foto.imprimir())
    impressora.adicionaLista(contrato.imprimir())
    impressora.imprimirTudo()

}