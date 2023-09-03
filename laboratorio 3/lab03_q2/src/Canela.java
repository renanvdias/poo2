public class Canela extends Decorator{

    public Canela (Cafe cafe){
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 2.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com canela";
    }

}