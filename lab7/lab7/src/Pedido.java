public abstract class Pedido {
    protected int quantidade;
    protected double valorItem;
    protected String formaPagamento;

    public Pedido(int quantidade, double valorItem, String formaPagamento) {
        this.quantidade = quantidade;
        this.valorItem = valorItem;
        this.formaPagamento = formaPagamento;
    }

    public final void processarPedido() {
        processarPagamento();
        if (isEntregaNecessaria()) {
            realizarEntrega();
        }
    }
    protected abstract void processarPagamento();

    protected abstract boolean isEntregaNecessaria();

    protected abstract void realizarEntrega();
}