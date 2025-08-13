// (опционально) package your.package;

public class JuiceRecipe {
    private final String name;
    private final int[] need = new int[Fruit.values().length]; // индекс = Fruit.ordinal()

    public JuiceRecipe(String name) {
        this.name = name;
    }

    // Чейнинг: recipe.set(ORANGE, 3).set(BANANA, 1) ...
    public JuiceRecipe set(Fruit f, int amount) {
        need[f.ordinal()] = amount;
        return this;
    }

    public String getName() {
        return name;
    }

    public int needOf(Fruit f) {
        return need[f.ordinal()];
    }

    // Для перебора всех потребностей (только чтение снаружи по контракту задания)
    public int[] getAllNeeds() {
        return need;
    }
}
