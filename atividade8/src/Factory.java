import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, EnemyPrototype> prototypes = new HashMap<>();

    static {
        prototypes.put("OrcGreen", new Enemy(100, "Orc Verde", "demonio", "masculino", 1000));
        prototypes.put("GoblinRed", new Enemy(250, "GoblinRed", "demonio", "feminino", 3000));
    }

    public static EnemyPrototype createEnemy(String type) {
        EnemyPrototype prototype = prototypes.get(type);
        if (prototype == null) {
            throw new IllegalArgumentException("Tipo desconhecido: " + type);
        }
        return prototype.clone();
    }
}