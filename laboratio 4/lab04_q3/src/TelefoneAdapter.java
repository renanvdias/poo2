public class TelefoneAdapter implements TelefoneCelular{
    private TelefoneFixo telefoneFixo;

    public TelefoneAdapter(TelefoneFixo telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    @Override
    public void ligar(String numero) {
        telefoneFixo.ligar(numero);
    }

    @Override
    public void desligar() {
        telefoneFixo.desligar();
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        //Não e possivel mandar mensagem de um telefone fixo
        System.out.println("Mensagem enviada para " + destinatario);
    }
}
