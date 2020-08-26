package pilhaencadeada
import No

class Pilha<T>() : TADPilha<T> {
    private var cabeca: No<T>? = null


    override fun insertTopo(valor: T) {
        val newNo = No<T>(valor, null)
        if (isPilhaVazia())
            cabeca = newNo
        else{
            newNo.proximo = cabeca
            cabeca = newNo
        }
    }

    override fun removeTopo(): T? {
        return if (isPilhaVazia()) {
            println("nada para ser removido")
            null
        } else {
            val removidoNo = cabeca!!
            cabeca = cabeca!!.proximo
            removidoNo.proximo = null
            removidoNo.valor
        }
    }

    override fun isPilhaVazia(): Boolean {
        return cabeca == null
    }

    override fun imprimePilha() {
        if (isPilhaVazia()) {
            println("Não há elementos!")
            return
        }
        var aux = cabeca
        while (aux!!.proximo != null){
            print(" -> ${aux.valor}")
            aux = aux.proximo
        }
        println(" -> ${aux.valor}")
    }

}