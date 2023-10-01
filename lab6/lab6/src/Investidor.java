public class Investidor implements Observer{
    private Acao acao;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker corretor;

    public Investidor(Acao acao, double limiteMinimo, double limiteMaximo, AcaoBroker corretor) {
        this.acao = acao;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.corretor = corretor;
        acao.adicionar(this);
    }

    @Override
    public void notificar(double preco) {
        if (preco <= limiteMinimo || preco >= limiteMaximo) {
            corretor.vender(acao);
        }
    }
}
