public class Pix implements StrategyPagamento{
    String chavePix;

    public Pix(String chavePix){
        this.chavePix = chavePix;
    }

    public void pagar(CarrinhoCompras carrinho) {
        System.out.println("Pagamento por PIX realizado");
    }
}
