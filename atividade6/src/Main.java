public class Main {
    public static void main(String[] args) {
        BebidaQuente cafe = new Cafe();
        cafe.prepararBebida();

        BebidaQuente chocolate = new ChocolateQuente();
        chocolate.prepararBebida();

        BebidaQuente cha = new Cha();
        cha.prepararBebida();
    }
}