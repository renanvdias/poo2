public class Main {
    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();
        Item item1 = new Item("item1", 10.0);
        Item item2 = new Item("item2", 20.0);

        carrinho.adicionaItem(item1);
        carrinho.adicionaItem(item2);

        carrinho.realizaPagamento(new Pix("00000-0000"));

        carrinho.realizaPagamento(new Cartao("939438543009"));

        carrinho.realizaPagamento(new Boleto("464596054694506"));

        carrinho.calculaFrete(new SedexFrete());
        carrinho.calculaFrete(new NormalFrete());

    }
}