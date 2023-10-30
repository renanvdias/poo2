public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Prata", "Fiat", "Palio");
        Veiculo onibus = new Onibus("Azul", 80, 2018);
        Veiculo bicicleta = new Bicicleta("Branca");

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