import alocacao_estatica.ListaEstatica
import alocacao_estatica.TADListaEstatica
import listaencadeada.ListaEncadeada

fun main(){
    /*
    * teste para Lista Estatica
    * */
    testeListaEstatica()


    println("\n")
    /*
    * teste para Lista Encadeada String
    * */
    testaListaEncadeadaStr()


    println("\n")
    /*
    * teste para Lista Encadeada Int
    * */
    testaListaEncadeadaInt()


}
fun testeListaEstatica(){
    println("teste da Lista Estática \n")
    val lista: TADListaEstatica<Int> = ListaEstatica(5)
    lista.set(0, 1)
    lista.addPrimeiro(10)
    lista.addUltimo(0)
    lista.addAntes(3, 7)
    lista.addDepois(3, 4)
    lista.addPrimeiro(20)
    lista.remove(1)
    lista.removePosicao(3)
    println("valores ->" + " first=" + lista.first() +  " -> last="
            + lista.last() + " -> anterior a 2="
            + lista.anterior(2) + " -> posterior a 1="
            + lista.posterior(1))
}

fun testaListaEncadeadaInt(){
    println("teste da Lista Encadeada com números \n")
    val listaInt: ListaEncadeada<Int> = ListaEncadeada()
    listaInt.insereOrdenando(3)
    listaInt.insereOrdenando(2)
    listaInt.insereOrdenando(5)
    listaInt.insereOrdenando(4)
    listaInt.insereOrdenando(1)
}

fun testaListaEncadeadaStr(){
    println("teste da Lista Encadeada com Strings \n")
    val listaStr: ListaEncadeada<String> = ListaEncadeada()
    listaStr.insereFinal("um")
    listaStr.insereInicio("dois")
    listaStr.inserePosicao("3",0)
    listaStr.inserePosicao("4",-1)
    listaStr.inserePosicao("5",3)
    listaStr.insereInicio("6")
    listaStr.insereInicio("s")
    listaStr.insereInicio("mu")
    listaStr.removeFinal()
    listaStr.removeInicio()
    listaStr.removePosicao(2)
    listaStr.removeString('m')

}