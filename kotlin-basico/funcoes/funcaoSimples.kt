fun main() {

    val msgIdade = mostraIdade()
    println(msgIdade)

}

fun mostraIdade() : String {
    
    // Na função pode-se criar variáveis e condicionais
    // E essa função pode ser chamada em outra para executar as operações definidas nesta

    var idade = 41
    
    var retornoIdade = if (idade == 41) {
        "Idade é igual a 41"
    } else {
        "Idade não é igual a 41"
    }

    return retornoIdade
}