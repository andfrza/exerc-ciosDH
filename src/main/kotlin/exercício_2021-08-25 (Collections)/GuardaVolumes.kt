package `exercício_2021-08-25 (Collections)`

class GuardaVolumes {
    var bancoDeDados= mutableMapOf<Int,MutableList<Peças>>()
    var codigoDeRastreio:Int=0

    fun guardarPecas(novasPecas:MutableList<Peças>):Int{
        bancoDeDados.put(bancoDeDados.size,novasPecas)
        return bancoDeDados.size-1
    }

    fun mostrarPecas(){
        for (item in bancoDeDados){
            println(item)
        }

    }
    fun mostrarPecasNum(codigoDeRastreio: Int){
        println(bancoDeDados[codigoDeRastreio])
    }
    fun devolverPecas(codigoDeRastreio: Int):Int{
        bancoDeDados.remove(codigoDeRastreio)
        return bancoDeDados.size
    }

}