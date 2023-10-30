public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Vermelho", "Toyota", "Camry");
        Veiculo onibus = new Onibus("Azul", 50, 2020);
        Veiculo bicicleta = new Bicicleta("Verde");

        VeiculoPrint printVisitor = new VeiculoPrint();
        VeiculoMessage messageVisitor = new VeiculoMessage();

        carro.accept(printVisitor);
        onibus.accept(printVisitor);
        bicicleta.accept(printVisitor);

        carro.accept(messageVisitor);
        onibus.accept(messageVisitor);
        bicicleta.accept(messageVisitor);
    }
}