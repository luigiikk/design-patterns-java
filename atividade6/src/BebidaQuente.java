abstract class BebidaQuente {

    public final void prepararBebida(){
        ferverAgua();
        preparar();
        servir();
    }
    public void ferverAgua(){
        System.out.println("Fervendo agua");
    }
    public abstract void preparar();

    public void servir(){
        System.out.println("Servindo bebida");
    }
}