public class Enemy implements EnemyPrototype {
    private int idade;
    private String nome;
    private String raca;
    private String sexo;
    private int forca;

    public Enemy(int idade, String nome, String raca, String sexo, int forca) {
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.forca = forca;
    }

    @Override
    public EnemyPrototype clone() {
        return new Enemy(idade, nome, raca, sexo, forca);
    }
    @Override
    public void displayInfo() {
        System.out.println("Inimigo: " + nome + ",Raca: " + raca + ", Sexo: " + sexo + ", Idade: " + idade + ", Forca: " + forca);
    }
}