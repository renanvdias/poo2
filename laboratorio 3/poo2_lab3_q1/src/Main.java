public class Main {
    public static void main(String[] args) {

        //Criando Pizza de Marguerita
        Pizza massaFina = new MassaFinaPizza();
        Pizza comTomate = new Tomate(massaFina);
        Pizza marguerita = new Queijo(comTomate);

        //Demonstrando
        System.out.println(marguerita.custo());
        System.out.println(marguerita.getDescricao());

        //Criando Pizza Portuguesa
        Pizza massaEspessa = new MassaEspessaPizza();
        Pizza espTomate = new Tomate(massaEspessa);
        Pizza espTomateOv = new Ovo(espTomate);
        Pizza portuguesa = new Queijo(espTomateOv);

        //Demonstrando
        System.out.println(portuguesa.custo());
        System.out.println(portuguesa.getDescricao());
    }
}