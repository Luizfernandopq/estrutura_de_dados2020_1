package listaencadeada

import java.text.FieldPosition

/*
* TAD (Tipo Abstrato de Dados) representa Lista Encadeada
*
* Luiz Fernando Paulino Queiroz
* */
interface TADListaEncadeada<T> {
    /*
    * Operações de inserção
    * */
    fun insereInicio(valor: T)
    fun inserePosicao(valor: T, posicao: Int)
    fun insereFinal(valor: T)

    /*
    * Operações de remoção
    * */
    fun removeInicio(): T?
    fun removePosicao(posicao: Int): T?
    fun removeFinal(): T?

    /*
    * Operaçoes Auxiliares
    * */
    fun isListaVazia(): Boolean
    fun imprimeLista()

}