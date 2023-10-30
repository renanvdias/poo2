public class Cartao implements StrategyPagamento{
    String numCartao;

    public Cartao(String num){
        this.numCartao = num;
    }

    public void pagar(CarrinhoCompras carrinho) {
        System.out.println("Pagamento por cartão realizado com sucesso");
    }
}
