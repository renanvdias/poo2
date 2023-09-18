public class FachadaCarro {
    private Motor motor;
    private Cinto cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public FachadaCarro() {
        this.motor = new Motor();
        this.cinto = new Cinto();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void dirigir() {
        motor.ligar();
        cinto.colocar();
        porta.trancar();
        farol.acender();
        radio.ligar();
        radio.sintonizar();
    }

    public void finalizar() {
        motor.desligar();
        cinto.tirar();
        porta.destrancar();
        farol.apagar();
        radio.desligar();
    }

}
