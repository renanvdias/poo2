public class Decorator implements Cafe{
    private Cafe cafe;

    public Decorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }
}
