// O padrão de projeto Template define o esqueleto de um algoritmo em uma operação, adiando alguns passos para as subclasses.
// O padrão Decorator, por outro lado, é usado para adicionar novas funcionalidades a um objeto sem alterar sua estrutura.
public class Main {
    public static void main(String[] args) {

        Pedido pedidoOnline = new PedidoOnline(5, 10.0, "Cartão de Crédito");
        pedidoOnline.processarPedido();

        Pedido pedidoLoja = new PedidoLoja(3, 15.0, "Dinheiro");
        pedidoLoja.processarPedido();

    }
}