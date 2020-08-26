package listaencadeada

import No

class ListaEncadeada<T> : TADListaEncadeada<T> {

    private var cabeca: No<T>? = null
    private var tamanho: Int = 0

    override fun insereInicio(valor: T) {
        val novoNo = No(valor, null)
        if (isListaVazia())
            cabeca = novoNo
        else {
            novoNo.proximo = cabeca
            cabeca = novoNo
        }
        tamanho++
        imprimeLista()
    }

    override fun inserePosicao(valor: T, posicao: Int) {
        if (posicao < 0 || posicao > tamanho){
            println("Posição inválida para inserção, lista tem apenas ${tamanho} elementos")
            return
        }
        if (posicao == 0)
            return insereInicio(valor)
        val novoNo = No(valor,null)
        var noAuxAnt = cabeca
        for (i in 0 until posicao - 1)
            noAuxAnt = noAuxAnt!!.proximo
        novoNo.proximo = noAuxAnt!!.proximo
        noAuxAnt.proximo = novoNo
        tamanho++
        imprimeLista()
    }

    override fun insereFinal(valor: T) {
        val novoNo = No(valor, null)
        if (cabeca == null)
            cabeca = novoNo
        else {
            pegaCauda()!!.proximo = novoNo
        }
        tamanho++
        imprimeLista()
    }

    fun pegaCauda(): No<T>? {
        if (isListaVazia())
            return null
        var noAux: No<T>? = cabeca
        while (noAux!!.proximo != null){
            noAux = noAux.proximo
        }
        return noAux
    }

    override fun removeInicio(): T? {
        if(isListaVazia()) {
            return null

        }

        val valor = cabeca!!.valor
        cabeca = cabeca!!.proximo
        tamanho--
        imprimeLista()
        return valor
    }

    override fun removePosicao(posicao: Int): T? {
        if (posicao < 0 || posicao >= tamanho){
            println("Posição inválida para remoção, lista tem apenas ${tamanho} elementos")
            return null
        }
        if (posicao == 0) {
            val noRemovido = cabeca!!
            cabeca = cabeca!!.proximo
            noRemovido.proximo = null
            tamanho--
            imprimeLista()
            return noRemovido.valor
        }
        else {


            var noAux: No<T>? = cabeca!!
            for (i in 0 until posicao - 1)
                noAux = noAux!!.proximo
            val noRemovido = noAux!!.proximo
            noAux.proximo = noRemovido!!.proximo
            noRemovido.proximo = null
            tamanho--
            imprimeLista()
            return noRemovido.valor
        }
    }

    override fun removeFinal(): T? {
        when {
            isListaVazia() -> return null

            cabeca!!.proximo == null -> {
                val valor = cabeca!!.valor
                cabeca = null
                tamanho--
                imprimeLista()
                return valor
            }

            else -> {
                var noAux: No<T>? = cabeca
                while (noAux!!.proximo!!.proximo != null) {
                    noAux = noAux.proximo
                }
                val valor = noAux.proximo!!.valor
                noAux.proximo = null
                tamanho--
                imprimeLista()
                return valor
            }
        }
    }

    override fun isListaVazia(): Boolean {
        return when {
            cabeca != null -> false
            else -> true
        }

    }

    override fun imprimeLista() {
        if (isListaVazia()) {
            println("Não há elementos!")
            return
        }
        var aux = cabeca
        while (aux!!.proximo != null){
            print(" -> ${aux.valor}")
            aux = aux.proximo
        }
        println(" -> ${aux.valor}")
        println("tamanho = ${tamanho}")
    }

}