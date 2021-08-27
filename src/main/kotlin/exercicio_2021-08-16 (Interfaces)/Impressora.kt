package `exercicio_2021-08-16 (Interfaces)`

class Impressora() {
    var listaImprimivel: MutableList<String> =mutableListOf<String>()
    fun adicionaLista(adicional: String){
        listaImprimivel.add(adicional)
    }
    fun imprimirTudo(){
        for(item in listaImprimivel){
            println(item)
        }
    }
}