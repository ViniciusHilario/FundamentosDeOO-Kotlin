package one.digitalinnovation.digionebank

class Pessoa {

    var nome:String = "Vinicius"
    var cpf:String = "123.123.123-12"

}

fun main(){

    val vinicius = Pessoa()

    println("Nome: " + vinicius.nome)
    println("CPF: " + vinicius.cpf)

}