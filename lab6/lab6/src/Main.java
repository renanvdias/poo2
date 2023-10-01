public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao();
        AcaoBroker corretor = new AcaoBroker();
        Investidor investidor = new Investidor(acao, 10.0, 20.0, corretor);

        acao.setPreco(15.0);
        acao.setPreco(25.0);
        acao.setPreco(5.0);
    }
}
