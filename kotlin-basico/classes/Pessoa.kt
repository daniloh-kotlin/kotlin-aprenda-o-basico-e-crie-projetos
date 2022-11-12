class Endereco() {
    val vila = "Vila 1234"
    val rua = "Rua 1234"
    val numero = 1234
}

class Pessoa {
    val nome = "Pedro"
    val idade = 30
    val endereco = Endereco()
}

fun main() {
    val pessoa = Pessoa()
    val endereco = pessoa.endereco

    println("=== Nome e Idade === ")
    println("Nome: " + pessoa.nome)
    println("Idade: " + pessoa.idade)

    println()

    println("=== ENDEREÇO ===")
    println("Vila: " + endereco.vila)
    println("Rua: " + endereco.rua)
    println("Nº: " + endereco.numero)
}