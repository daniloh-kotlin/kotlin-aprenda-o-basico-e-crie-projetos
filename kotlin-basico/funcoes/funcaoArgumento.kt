fun main() {
    // Função com argumento


    var msgIdade = adulto(18)

    println(msgIdade)



    // Simplificando Função
    msgIdade = adultoRetornoDireto(18)

    println(msgIdade)
}

// Recebe como argumento uma idade (valor inteiro) e retorna uma String
fun adulto(idade: Int): String {

    val retorno = if (idade >= 18) {
        "É adulto"
    } else {
        "Não é adulto"
    }

    return retorno

}


fun adultoRetornoDireto(idade: Int): String {
    return if (idade >= 18) { "É adulto" } else { "Não é adulto" }
}