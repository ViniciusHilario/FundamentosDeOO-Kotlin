package one.digitalinnovation.digionebank

data class Banco(

    val nome: String,
    val numero: Int

) {

    //funcao usando interpolação
    fun info() = "$nome - $numero"

}
