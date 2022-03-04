fun main() {
    val conta = ContaBanco()
    //Chamar os métodos da ContaBanco
    conta.mostrarSaldo()
    println("Digite o valor de saque: ")
    val saque = readLine()!!.toDouble()
    conta.saque(saque)
    println("Digite o valor do depósito: ")
    val valor = readLine()!!.toDouble()
    conta.deposito(valor)
    conta.mostrarSaldo()
}