public class Decaf implements Cafe{

    @Override
    public double calculaCusto() {
        return 6.00;
    }

    @Override
    public String getDescricao() {
        return "Café Decaf";
    }
}