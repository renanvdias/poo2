public class ContaBancaria implements Conta{
    private double saldo = 0;

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void fazerDeposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " efetuado. Novo saldo: R$" + saldo);
    }
}
