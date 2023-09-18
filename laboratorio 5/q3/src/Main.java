public class Main {
    public static void main(String[] args) {
        Conta contaProxy = new ProxyConta();

        contaProxy.verificarSaldo();
        contaProxy.fazerDeposito(1000.0);

        contaProxy.verificarSaldo();
    }
}