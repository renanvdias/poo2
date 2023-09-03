public class Espresso implements Cafe{

    @Override
    public double calculaCusto() {
        return 5.00;
    }

    @Override
    public String getDescricao() {
        return "Café Expresso";
    }
}
