fun main() {

    var idade = 41

    // Escolhi criar uma variável imutável com: 'val'
    val msgIdade = when {
        idade == 40 -> "Idade é igual a 40"
        idade == 39 -> "Idade é igual a 39"
        else -> "Idade é igual a " + idade
    }  

    println(msgIdade)
}