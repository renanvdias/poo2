public class Main {
    public static void main(String[] args) {

        TelefoneFixo telefoneFixo = new TelefoneFixo();
        TelefoneCelular celular = new TelefoneAdapter(telefoneFixo);

        celular.ligar("9999999");
        celular.desligar();
        celular.enviarMensagem("Renan", "Oi");
    }
}