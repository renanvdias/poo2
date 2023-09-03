public class Leite extends Decorator{

    public Leite (Cafe cafe){
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 5.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com leite";
    }

}
