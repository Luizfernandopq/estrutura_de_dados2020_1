package filaencadeada

interface TADFilaEncadeada<T> {
    fun insereFinal(valor: T)
    fun removeInicio() : T?
    fun isFilaVazia() : Boolean
    fun imprimeFila()
    fun size(): Int
}