
public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Comando ligarLampada = new LigarLampada(lampada);

        Botao botao = new Botao(ligarLampada);

        botao.ligar();
    }
}