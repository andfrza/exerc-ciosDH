package `exercício_2021-08-23`

class Caixa(){
    inline fun fechamentoDeConta (cabecalhoDoComprovante:()->String){
    cabecalhoDoComprovante.invoke()
    }
}