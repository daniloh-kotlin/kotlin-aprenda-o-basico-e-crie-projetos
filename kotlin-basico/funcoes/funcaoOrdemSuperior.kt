fun main() {
    // Funções de Ordem Superior, são funções que recebem como argumento outras funções
    val tamanhoString = tamanhoStringFuncao("Android", { input -> input.length }) 

    println("O tamanho da String 'Android' é: " + tamanhoString)
}

fun tamanhoStringFuncao(texto: String, outraFuncao: (String) -> Int): Int {
    return outraFuncao(texto)
}