public class Main {
    public static void main(String[] args) {
        // Criando inimigo original
        EnemyPrototype enemy = new Enemy(1000, "Goblin", "demonio", "Masculino", 1200);
        enemy.displayInfo();

        // Clonando o inimigo
        EnemyPrototype enemyCopia = enemy.clone();
        enemyCopia.displayInfo();

        // Usando Factory
        EnemyPrototype orcClone = Factory.createEnemy("OrcGreen");
        orcClone.displayInfo();

        EnemyPrototype goblinClone = Factory.createEnemy("GoblinRed");
        goblinClone.displayInfo();
    }
}