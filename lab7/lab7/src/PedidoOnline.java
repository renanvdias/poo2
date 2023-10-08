public class PedidoOnline extends Pedido{
    public PedidoOnline(int quantidade, double valorItem, String formaPagamento) {
        super(quantidade, valorItem, formaPagamento);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento online...");
    }

    @Override
    protected boolean isEntregaNecessaria() {
        return true;
    }

    @Override
    protected void realizarEntrega() {
        System.out.println("Realizando entrega...");
    }
}
