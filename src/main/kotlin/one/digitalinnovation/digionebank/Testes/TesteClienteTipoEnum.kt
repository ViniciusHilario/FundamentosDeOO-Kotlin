package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){

    //Pegando a descrição do Enum
    ClienteTipo.values().forEach { elemento ->

        println("${elemento.name} - ${elemento.descricao}")

    }

    ClienteTipo.values().forEach {

        println("${it.name} - ${it.descricao}")

    }

    //Criando um teste para a descrção que foi pega
    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">>> ${pj.name} - ${pj.descricao}")

}