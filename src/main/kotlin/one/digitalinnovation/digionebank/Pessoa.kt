package one.digitalinnovation.digionebank

//Classe Pessoa com uma Classe interna
class Pessoa {

    var nome:String = "Vinicius"
    var cpf:String = "123.123.123-12"

    //privando só o SET
    private set

    //Construtor secundario
    constructor()

    //funcao usando interpolação
    fun pessoaInfo() = "$nome e $cpf"

}

//Função main para fazer um teste rápido

fun main(){
    val vinicius = Pessoa()

    println(vinicius.pessoaInfo())

}