package one.digitalinnovation.digionebank

//Classe Pessoa com uma Classe interna
class Pessoa {

    var nome:String = "Vinicius"
    var cpf:String = "123.123.123-12"

    //privando só o SET
    private set

}

//Função main para fazer um teste rápido

fun main(){
    val vinicius = Pessoa()

    println("Nome: " + vinicius.nome)
    println("CPF: " + vinicius.cpf)

}