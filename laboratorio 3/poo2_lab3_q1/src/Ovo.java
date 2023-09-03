public class Ovo extends ToppingDecorator{

    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 4.50;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com ovo";
    }


}