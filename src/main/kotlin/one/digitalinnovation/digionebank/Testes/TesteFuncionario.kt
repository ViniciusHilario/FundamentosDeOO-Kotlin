package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){

    val vinicius = Pessoa(nome = "Vinicius Oliveira", cpf = "123.123.123-12")

    println(vinicius.nome)
    println(vinicius.cpf)

    val joao = Funcionario(nome = "João Vitor", cpf = "123.123.123-12", BigDecimal.valueOf(2000.00))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}