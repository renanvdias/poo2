public class Bicicleta extends Veiculo{
    public Bicicleta(String cor) {
        super(cor);
    }

    @Override
    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}
