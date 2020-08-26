package pilhaencadeada

interface TADPilhaEncadeada<T> {
    fun insertTopo(valor: T)
    fun removeTopo() : T?
    fun isPilhaVazia() : Boolean
    fun imprimePilha()
}