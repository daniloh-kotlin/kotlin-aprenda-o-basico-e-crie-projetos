fun main() {

    // ANULANDO UMA VARIÁVEL

    var nulo: String? = null
    
    if (nulo != null) {
        println("A variável 'nulo' não contém nulo")
    } else {
        println("A variável 'nulo' contém nulo")
    }


    // NÃO ANULANDO UMA VARIÁVEL

    var variavelNula = null
    
    if (variavelNula != null) {
        println("A variável não contém nulo.")
    } else {
        println("A variável contém nulo.")
    }


    // ATRIBUINDO NULO À VARIÁVEL 

    // Não é preciso definir a variável como anulável
    // se atribuir um valor nulo, o Kotlin reconhece que a variável está nula
    var outraVariavelNula = null

    if (outraVariavelNula == null) {
        println("A variável outraVariavelNula contém nulo")
    }

}