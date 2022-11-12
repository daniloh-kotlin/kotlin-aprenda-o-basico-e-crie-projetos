fun main() {

    val tamanhoStringFuncao: (String) -> Int = {
        input -> input.length
    }

    val tamanhoString = tamanhoStringFuncao("Android")

    println("A largura da String 'Android' é: " + tamanhoString)
}