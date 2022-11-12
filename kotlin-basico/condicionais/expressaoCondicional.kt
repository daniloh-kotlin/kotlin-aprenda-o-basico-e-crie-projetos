fun main() {
    var idade = 40
    var msgIdade: String = if (idade == 41) {
        "Idade é igual a 41"
    } else if (idade == 39) {
        "Idade é igual a 39"
    } else {
        "Idade é igual a " + idade
    }

    println(msgIdade)
}