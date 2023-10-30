public class Onibus extends Veiculo{
    private int lugares;
    private int anoFabricacao;

    public Onibus(String cor, int lugares, int anoFabricacao) {
        super(cor);
        this.lugares = lugares;
        this.anoFabricacao = anoFabricacao;
    }

    public int getLugares() {
        return lugares;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}
