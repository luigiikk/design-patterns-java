public class Fachada_Cinema {
    private Sistema_de_Som som;
    private Sistema_de_Luz luz;
    private Projetor projetor;
    private Player dvd;

    public Fachada_Cinema(Sistema_de_Som som, Sistema_de_Luz luz, Projetor projetor, Player dvd){
        this.som = som;
        this.luz = luz;
        this.projetor = projetor;
        this.dvd = dvd;
    }

    public void assistirFilme(String filme){
        System.out.println("Preparando para assistir o filme...");
        luz.apagar();
        som.ligar();
        projetor.ligar();
        dvd.play(filme);
    }

    public void encerrarSessao(){
        System.out.println("Encerrando sessão de cinema...");
        dvd.stop();
        projetor.desligar();
        som.desligar();
        luz.acender();
    }
}
