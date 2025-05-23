public class Builder_Main {
    public static void main(String[] args) {
        //Implemente a chamada do Builder

        Personagem guerreiro = new GuerreiroBuilder()
                .comNome("Thorfin")
                .comVida(100)
                .comMana(1090)
                .comForca(100)
                .comInteligencia(100)
                .comAgilidade(100)
                .build();

        Personagem mago = new MagoBuilder()
                .comNome("Merlin")
                .comVida(100)
                .comMana(1090)
                .comForca(100)
                .comInteligencia(100)
                .comAgilidade(100)
                .build();

        Personagem arqueiro = new ArqueiroBuilder()
                .comNome("Ashe")
                .comVida(100)
                .comMana(1090)
                .comForca(100)
                .comInteligencia(100)
                .comAgilidade(100)
                .build();

        System.out.println("=== GUERREIRO ===");
        System.out.println(guerreiro);

        System.out.println("=== MAGO ===");
        System.out.println(mago);

        System.out.println("=== ARQUEIRO ===");
        System.out.println(arqueiro);
    }
}