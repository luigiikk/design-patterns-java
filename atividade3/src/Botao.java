public class Botao {
    Comando comando;

    public Botao(Comando comando){
        this.comando = comando;
    }

    public void ligar(){
        comando.executar();
    }
}
