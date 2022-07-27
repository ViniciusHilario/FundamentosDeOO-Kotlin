package Testes

import one.digitalinnovation.digionebank.Banco

//Função main para testar a data class Banco
fun main(){

    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    //Criando uma cópia, para mudar o nome no data class, usado só se for necessario
    val banco2 = digiOneBank.copy(nome = "Banco2")

    //println(banco2.nome)
    //println(banco2.numero)

    //usando a função interpolação da data class Banco
    println(banco2.info())

}