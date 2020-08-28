package alocacao_estatica

interface TADListaEstatica<E> {
    /*
    *   Operações básicas
    * */
    fun set(pos: Int, e: E): E

    fun addPrimeiro(e: E)
    fun addUltimo(e: E)

    fun addAntes(pos: Int, e: E)
    fun addDepois(pos: Int, e: E)

    fun remove(e: E)
    fun removePosicao(pos: Int)


    /*
    *   Operações auxiliares
    * */
    fun first(): E?
    fun last(): E?

    fun anterior(pos: Int): E?
    fun posterior(pos: Int): E?
}