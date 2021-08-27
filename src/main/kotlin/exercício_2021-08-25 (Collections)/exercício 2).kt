package `exercício_2021-08-25 (Collections)`

fun main() {
    var amigos1= listOf("Juan","El Divo","Maromba","Zé Bonitinho")
    var amigos2=listOf("Dark Knight","Bruce Wayne","Batfeck","Gengiva")
    var amigos3=listOf("Ju","Mary","Marilene","Ventania")
    var amigos4= listOf("Lukinha","Jorge","George","Kevin Flynn")

    var dicionarioDeApelidos= mapOf("João" to amigos1, "Miguel" to amigos2, "Maria" to amigos3,"Lucas" to amigos4 )

    for (item in dicionarioDeApelidos){
        println(item)
    }
}
