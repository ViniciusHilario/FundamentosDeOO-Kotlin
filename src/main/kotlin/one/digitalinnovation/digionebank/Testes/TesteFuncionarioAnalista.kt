package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.Analista

import java.math.BigDecimal

fun main() {

    val joao = Analista("João Vitor", "123.123.123-12", 2000.00)

    ImprimeRelatorioFuncionario.imprime(joao)

}
