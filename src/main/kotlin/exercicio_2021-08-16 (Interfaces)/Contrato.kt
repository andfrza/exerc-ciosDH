package `exercicio_2021-08-16 (Interfaces)`

class Contrato : Imprimivel {
    override var nome = "contrato de trabalho"
    override var tipoDeDocumento = "contrato"

    override fun imprimir():String {
        return "Eu sou um ${tipoDeDocumento}, ${nome} "
    }
}