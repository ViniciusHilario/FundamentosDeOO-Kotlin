package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val filipe = Gerente("Filipe Oliveira", "123.123.123-12", 5000.00, "senha123")

    ImprimeRelatorioFuncionario.imprime(filipe)

    TesteAutenticacao().autentica(filipe)

}