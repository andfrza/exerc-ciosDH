package `exercício_2021-08-25 (Collections)`

fun main() {
    var chinelo=Peças("Havaianas","Azul")
    var celular = Peças("Samsung","S20")
    var bolaDeVolei=Peças("Wilson","Branca")
    var guardaSol=Peças("Genérica","Listrado")
    var listaDeObjetos:MutableList<Peças> = mutableListOf<Peças>(chinelo,celular)
    var listaPraia:MutableList<Peças> = mutableListOf<Peças>(bolaDeVolei,guardaSol)
    var armario=GuardaVolumes()

    println(armario.guardarPecas(listaPraia))
    println(armario.guardarPecas(listaDeObjetos)) //adicionei duas listas para meu banco de dados
    armario.mostrarPecas()                        //ele exibe os códigos do Kotlin.
    armario.mostrarPecasNum(0)      //ele exibe os códigos do Kotlin.
    println(armario.devolverPecas(1)) // retira um espaço no map e me retorna o tamanho do map comprovando.

    // como acessar os atributos de Peça que estão na lista que foi passada para o map através do map??

}