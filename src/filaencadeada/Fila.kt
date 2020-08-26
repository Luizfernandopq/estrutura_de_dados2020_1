package filaencadeada
import No

class Fila<T>() : TADFilaEncadeada<T> {
    private var cabeca : No<T>? = null

    companion object{
        var tam = 0
    }


    override fun insereFinal(valor: T) {
        val newNo = No<T>(valor, null)
        if (isFilaVazia())
            cabeca = newNo
        else {
            var aux = cabeca!!
            while (aux.proximo != null){
                aux = aux.proximo!!
            }
            aux.proximo = newNo
        }
        tam++
    }

    override fun removeInicio(): T? {
        return if (isFilaVazia()) {
            println("nada para ser removido")
            null
        } else {
            tam--
            val removidoNo = cabeca!!
            cabeca = cabeca!!.proximo
            removidoNo.proximo = null
            removidoNo.valor
        }
    }


    override fun isFilaVazia(): Boolean {
        return cabeca == null
    }

    override fun imprimeFila() {
        if (isFilaVazia()) {
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

    override fun size(): Int{
        return tam
    }
}