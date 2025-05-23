public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Notebook", 3500);
        Item item2 = new Item("Mouse", 120);

        Caixa caixaPequena = new Caixa("Eletronicos");
        caixaPequena.adicionar(item1);
        caixaPequena.adicionar(item2);

        Caixa caixaGrande = new Caixa("Pedido Completo");
        caixaGrande.adicionar(caixaPequena);
        caixaGrande.adicionar(new Item("Cupom fiscal", 0));

        System.out.println("====== Hierarquia do Pedido ======");
        caixaGrande.exibir("");

        System.out.println("====== Valor do Pedido ======");
        double total = caixaGrande.getPreco();
        System.out.println("Total: R$ " + total);
    }
}