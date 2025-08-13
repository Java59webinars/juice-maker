// (опционально) package your.package;

public class JuiceMachine {
    private final String name;
    private final int[] stock = new int[Fruit.values().length]; // остатки по фруктам

    public JuiceMachine(String name) {
        this.name = name;
    }

    // Универсальное добавление любого фрукта с уведомлением о недобавленном остатке
    public void add(Fruit f, int amount) {
        int idx = f.ordinal();
        int before = stock[idx];
        stock[idx] = Math.min(stock[idx] + amount, f.max);
        int added = stock[idx] - before;
        if (added < amount) {
            System.out.println("Вместо " + amount + " " + f.ruNameGenitive
                    + " добавлено только " + added + " (лимит " + f.max + ")");
        }
    }

    // Приготовление по рецепту: проверка -> вывод процесса -> списание
    public void makeJuice(JuiceRecipe recipe) {
        // Проверка наличия
        for (Fruit f : Fruit.values()) {
            int need = recipe.needOf(f);
            if (stock[f.ordinal()] < need) {
                System.out.println("Недостаточно: добавьте " + f.ruNameGenitive + "!");
                return;
            }
        }

        // Процесс приготовления (демо-лог)
        System.out.println("Готовлю сок \"" + recipe.getName() + "\":");
        for (Fruit f : Fruit.values()) {
            int n = recipe.needOf(f);
            if (n > 0) {
                System.out.println("Обрабатываю " + n + " " + f.ruNameGenitive + "...");
            }
        }

        // Списание остатков
        for (Fruit f : Fruit.values()) {
            stock[f.ordinal()] -= recipe.needOf(f);
        }
        System.out.println("Сок готов!");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("В машине: ");
        Fruit[] fs = Fruit.values();
        for (int i = 0; i < fs.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(stock[i]).append(" ").append(fs[i].ruNameGenitive);
        }
        return sb.toString();
    }

    // (опционально) Английская версия строки состояния
    public String toStringEn() {
        StringBuilder sb = new StringBuilder("In the machine: ");
        Fruit[] fs = Fruit.values();
        for (int i = 0; i < fs.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(stock[i]).append(" ").append(fs[i].enNamePlural);
        }
        return sb.toString();
    }
}
