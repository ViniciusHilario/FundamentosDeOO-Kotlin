package one.digitalinnovation.digionebank

//Classe Pessoa com uma Classe interna
class Pessoa {

    var nome:String = "Vinicius"
    var cpf:String = "123.123.123-12"

    // Criando uma Classe Interna
    inner class Endereco() {

        var rua:String = "Rua Teste"

    }

}

//Função main para fazer um teste rápido

fun main(){
    val vinicius = Pessoa()

    println("Nome: " + vinicius.nome)
    println("CPF: " + vinicius.cpf)

    println("Rua: " + vinicius.Endereco().rua)

}