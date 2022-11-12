class Endereco() {
    val vila = "Vila 1234"
    val rua = "Rua 1234"
    val numero = 1234
}

class PessoaEnderecoPersonalizado(val endereco: Endereco) {
    val nome = "Pedro"
    val idade = 30
    val enderecoVariavel = endereco
}

fun main() {
    val objetoEndereco = Endereco()
    val pessoa = PessoaEnderecoPersonalizado(objetoEndereco)
    val endereco = pessoa.enderecoVariavel
    
    println("=== Nome e Idade === ")
    println("Nome: " + pessoa.nome)
    println("Idade: " + pessoa.idade)

    println()

    println("=== ENDEREÇO ===")
    println(endereco.vila)
    println(endereco.rua)
    println(endereco.numero)
}