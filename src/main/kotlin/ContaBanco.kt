class ContaBanco {
    var titular = ""
    var tipo = 0 // 1=conta corrente - 2=conta poupanca
    var saldo = 0.0

    //Declarar os métodos (ou comportamentos)
    //Métodos - Saque, Depósito e Saldo
    //Declarar os métodos através de funções dentro da classe

    fun mostrarSaldo(){
        println("O saldo da sua conta é R$$saldo")
    }

    fun deposito (valor: Double){
        if(valor <= 0){
            println("Depósito impossível de ser realizado")
        }else{
            saldo += valor
            println("Depósito de R$$valor realizado com sucesso!")
        }
    }

    fun saque (valor: Double){
        if(saldo <= 0){
            println("Saldo insuficiente")
        }else if(valor <= 0){
            println("Saque impossível de ser realizado")
        }else if (valor > saldo){
            println("Saldo insuficiente")
        }else{
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso!")
        }
}
}