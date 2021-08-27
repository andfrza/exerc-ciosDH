package `exercicio_2021-08-18`

class Pessoa(var nome:String, var rg:Int) {
    override fun equals(other: Any?): Boolean {
        return (other is Pessoa&&this.rg==other.rg)
    }

    override fun toString(): String {
        return ("Nome: ${this.nome}, RG: ${this.rg}")
    }

    override fun hashCode(): Int {
        return this.rg
    }
}