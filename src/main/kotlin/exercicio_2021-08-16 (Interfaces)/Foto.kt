package `exercicio_2021-08-16 (Interfaces)`

class Foto : Imprimivel {

    override var nome = "selfie"
    override var tipoDeDocumento = "Foto"

    override fun imprimir():String {
        return "Eu sou uma ${tipoDeDocumento}, ${nome} "
    }
}