public class Main {
    public static void main(String[] args) {

        //Fazendo um café expresso com leite e canela
        Cafe cafePuro = new Espresso();
        Cafe expressLeite = new Leite(cafePuro);
        Cafe expressLeiCanela = new Canela(expressLeite);

        //Demonstrando
        System.out.println(expressLeiCanela.calculaCusto());
        System.out.println(expressLeiCanela.getDescricao());

    }
}