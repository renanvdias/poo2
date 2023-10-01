import java.util.ArrayList;
import java.util.List;

public class Acao{
    private List<Observer> observadores = new ArrayList<>();
    private double preco;

    public void adicionar(Observer observador) {
        observadores.add(observador);
    }

    public void remover(Observer observador) {
        observadores.remove(observador);
    }

    public void setPreco(double preco) {
        this.preco = preco;
        for (Observer observador : observadores) {
            observador.notificar(preco);
        }
    }
}