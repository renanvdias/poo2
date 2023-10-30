public class VeiculoPrint implements VeiculoVisitor{
    @Override
    public void visit(Carro carro) {
        System.out.println("Carro - Cor: " + carro.cor + ", Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo());
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Ônibus - Cor: " + onibus.cor + ", Lugares: " + onibus.getLugares() + ", Ano de Fabricação: " + onibus.getAnoFabricacao());
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta - Cor: " + bicicleta.cor);
    }

}
