import filaencadeada.Fila
import filaencadeada.TADFilaEncadeada
import pilhaencadeada.Pilha
import pilhaencadeada.TADPilha

fun main(){
      var fila: TADFilaEncadeada<Int> = Fila<Int>()
//    fila.imprimeFila()
//    fila.insereFinal(10)
//    fila.imprimeFila()
//    fila.insereFinal(20)
//    fila.imprimeFila()
//    fila.insereFinal(32)
//    fila.imprimeFila()
//    fila.insereFinal(12)
//    fila.imprimeFila()
//    println("\n ${fila.removeInicio()} \n")
//    fila.imprimeFila()

    val pilha: TADPilha<Any> = Pilha()

    pilha.imprimePilha()
    pilha.insertTopo("dez")

    pilha.imprimePilha()
    pilha.insertTopo(2)

    pilha.imprimePilha()
    pilha.insertTopo(20)

    pilha.imprimePilha()
    pilha.removeTopo()

    pilha.imprimePilha()
    pilha.removeTopo()
    pilha.imprimePilha()


}