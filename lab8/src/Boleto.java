public class Boleto implements StrategyPagamento{
    String codBoleto;

    public Boleto(String cod){
        this.codBoleto = cod;
    }

    public void pagar(CarrinhoCompras carrinho) {
        System.out.println("Pagamento por boleto realizado com sucesso");
    }
}
