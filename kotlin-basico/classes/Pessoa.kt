class Endereco() {
    val vila = "Vila 1234"
    val rua = "Rua 1234"
    val numero = 1234
}

class Pessoa {
    val endereco = Endereco()
}

fun main() {
    val pessoa = Pessoa()
    val endereco = pessoa.endereco

    println("=== ENDEREÇO ===")
    println(endereco.vila)
    println(endereco.rua)
    println(endereco.numero)
}