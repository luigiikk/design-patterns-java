public class Item implements PedidoComponent{
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "- " + nome + ": R$ " + preco);
    }
}