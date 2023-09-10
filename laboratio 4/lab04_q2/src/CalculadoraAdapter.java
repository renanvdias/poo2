public class CalculadoraAdapter implements Calculadora{

    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter() {
        this.calculadoraBinaria = new CalculadoraBinaria();
    }

    @Override
    public int somar(int a, int b) {
        return a+b;
    }

    @Override
    public int subtrair (int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a*b;
    }

    public String somar (String a, String b){
        return calculadoraBinaria.somar(a, b);
    }

    public String subtrair (String a, String b){
        return calculadoraBinaria.subtrair(a, b);
    }
}
