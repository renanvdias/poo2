import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens;
    private StrategyPagamento estrategiaPagamento;
    private FreteStrategy estrategiaFrete;

    public CarrinhoCompras() {
        this.itens = new ArrayList<Item>();
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public void realizaPagamento(StrategyPagamento estrategiaPagamento) {
        estrategiaPagamento.pagar(this);
    }

    public void setEstrategiaFrete(FreteStrategy estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calculaFrete(FreteStrategy estrategia) {
        return estrategia.calculaFrete();
    }

}
