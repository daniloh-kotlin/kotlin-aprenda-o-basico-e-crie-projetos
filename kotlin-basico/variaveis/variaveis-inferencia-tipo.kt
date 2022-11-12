fun main() {
    // Inferência de Tipo
    // O compilador do Kotlin irá inferir que a variável 'languageName' é do tipo String
    // Se tentar chamar uma função que não pertence ao tipo String ocorrerá um erro
    val languageName = "Kotlin"
    val upperCaseName = languageName.uppercase(); 

    println(upperCaseName)

    // // Falha ao compilar
    // languageName.inc();
}