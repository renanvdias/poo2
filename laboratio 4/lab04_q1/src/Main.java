public class Main {
    public static void main(String[] args) {

        Pato pt = new PatoDomestico();
        Ave ptAve = new PatoAveAdapter(pt);

        Pavao pv = new PavaoAzul();
        Ave pvAve = new PavaoAveAdapter(pv);

        Main main = new Main();

        ptAve.emitirSom();
        ptAve.voar();

        pvAve.emitirSom();
        pvAve.voar();
    }
}