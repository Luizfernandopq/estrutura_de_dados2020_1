package alocacao_estatica

/*
* As vantagens de se implementar Vetores com alocação estática são:
* A alocação é feita em tempo de compilação, portanto melhor será o desempenho em tempo de execução
* A busca por elementos não será obrigatoriamente iterativa
*
* */

class ListaEstatica<E>(private val tamanho: Int) : TADListaEstatica<E> {

    private var arrayList = mutableListOf<E?>()
    init {
        for (i in 0 until tamanho){
            arrayList.add(i, null)
        }
    }
    private var ponteiro = -1

    override fun set(pos: Int, e: E): E {
        if (pos == 0 || pos in 0 until ponteiro) {
            if (arrayList[pos] == null)
                ponteiro++
            arrayList[pos] = e
        }
        else{
            println("Posição inválida")
        }
        println(arrayList)
        return e
    }

    private fun addPosicao(pos: Int, e: E){
        for (i in ponteiro downTo pos){
            arrayList[i + 1] = arrayList[i]!!
        }
        arrayList[pos] = e
        println(arrayList)
        ponteiro++

    }

    override fun addPrimeiro(e: E) {
        if (isListaCheia())
            return println("A lista já está cheia")
        addPosicao(0, e)
    }
    override fun addUltimo(e: E) {
        if (isListaCheia())
            return println("A lista já está cheia")
        addPosicao(ponteiro + 1, e)
    }
    override fun addAntes(pos: Int, e: E) {
        if (isListaCheia())
            return println("A lista já está cheia")
        if (pos !in 0..(ponteiro+1))
            return println("Não há nada na posição $pos")
        addPosicao(pos - 1, e)
    }



    override fun addDepois(pos: Int, e: E) {
        if (isListaCheia())
            return println("A lista já está cheia")
        if (pos !in 0..ponteiro)
            return println("Não há nada na posição $pos")
        addPosicao(pos + 1, e)
    }

    override fun remove(e: E) {
        for (i in 0..ponteiro){
            if (arrayList[i] == e){
                removePosicao(i)
                return remove(e)
            }
        }
    }

    override fun removePosicao(pos: Int) {
        if (pos !in 0..ponteiro)
            return
        arrayList[pos] = null
        for (j in pos until ponteiro){
            arrayList[j] = arrayList[j+1]
            arrayList[j + 1] = null
        }
        println(arrayList)
        ponteiro--

    }

    override fun first(): E? {
        return arrayList[0]
    }

    override fun last(): E? {
        return arrayList[ponteiro]
    }

    override fun anterior(pos: Int): E? {
        return arrayList[pos - 1]
    }

    override fun posterior(pos: Int): E? {
        return if (pos < ponteiro)
            arrayList[pos + 1]
        else
            null

    }

    private fun isListaCheia(): Boolean{
        if (ponteiro + 1 < tamanho){
            return false
        }
        return true
    }
}