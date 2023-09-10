public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new CalculadoraAdapter();

        System.out.println(calculadora.somar(10, 5));
        System.out.println(calculadora.subtrair(10, 5));
        System.out.println(calculadora.multiplicar(10, 5));
        System.out.println(calculadora.somar("001", "111"));
        System.out.println(calculadora.subtrair("001", "111"));

    }
}