public class Chocolate extends Decorator{

    public Chocolate (Cafe cafe){
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 7.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com chocolate";
    }

}