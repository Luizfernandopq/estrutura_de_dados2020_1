package pilhaencadeada

interface TADPilha<T> {
    fun insertTopo(valor: T)
    fun removeTopo() : T?
    fun isPilhaVazia() : Boolean
    fun imprimePilha()
}