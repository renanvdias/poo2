public class ProxyConta implements Conta{
    private ContaBancaria contaReal;

    public void verificarSaldo() {
        if (contaReal == null) {
            contaReal = new ContaBancaria();
        }
        System.out.println("Verificação de saldo autorizada:");
        contaReal.verificarSaldo();
    }

    public void fazerDeposito(double valor) {
        if (contaReal == null) {
            contaReal = new ContaBancaria();
        }
        System.out.println("Depósito autorizado:");
        contaReal.fazerDeposito(valor);
    }
}
