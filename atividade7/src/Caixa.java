
import java.util.ArrayList;
import java.util.List;

public class Caixa implements PedidoComponent{
    private String descricao;
    private List<PedidoComponent> conteudo = new ArrayList<>();

    public Caixa(String descricao) {
        this.descricao = descricao;
    }

    public void adicionar(PedidoComponent component) {
        conteudo.add(component);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (PedidoComponent c: conteudo){
            total += c.getPreco();
        }
        return total;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "- " + descricao);
        for (PedidoComponent c: conteudo){
            c.exibir(prefixo + "  ");
        }
    }
}