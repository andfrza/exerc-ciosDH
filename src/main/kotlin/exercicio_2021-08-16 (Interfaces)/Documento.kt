package `exercicio_2021-08-16 (Interfaces)`

class Documento : Imprimivel {
    override var nome="RG"
    override var tipoDeDocumento="documento"
    override fun imprimir():String {
        return "Eu sou um ${tipoDeDocumento}, ${nome} "
    }
}