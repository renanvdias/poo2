public class PedidoLoja extends Pedido{
    public PedidoLoja(int quantidade, double valorItem, String formaPagamento) {
        super(quantidade, valorItem, formaPagamento);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento na loja...");
    }

    @Override
    protected boolean isEntregaNecessaria() {
        return false;
    }

    @Override
    protected void realizarEntrega() {
        // Não precisa
    }
}

