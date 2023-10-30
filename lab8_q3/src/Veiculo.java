public abstract class Veiculo {
    protected String cor;

    public Veiculo(String cor) {
        this.cor = cor;
    }

    public abstract void accept(VeiculoVisitor visitor);
}
