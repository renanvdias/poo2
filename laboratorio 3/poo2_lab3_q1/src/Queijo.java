public class Queijo extends ToppingDecorator{

    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 8.50;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com queijo";
    }


}
