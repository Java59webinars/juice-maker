// (опционально) package your.package;

public class Main {
    public static void main(String[] args) {
        JuiceMachine machine = new JuiceMachine("SuperJuicer 3000");

        // Загрузка остатков (покажет уведомления, если что-то не влезет)
        machine.add(Fruit.ORANGE, 5);
        machine.add(Fruit.APPLE, 5);
        machine.add(Fruit.CARROT, 5);
        machine.add(Fruit.BANANA, 5);
        machine.add(Fruit.PINEAPPLE, 5);
        System.out.println(machine);

        // 5 рецептов по условию
        JuiceRecipe orangeFresh = new JuiceRecipe("Апельсиновый фреш");
        orangeFresh.set(Fruit.ORANGE, 3);
        orangeFresh.set(Fruit.BANANA, 2);

        JuiceRecipe appleCarrot = new JuiceRecipe("Яблочно-морковный")
                .set(Fruit.APPLE, 2)
                .set(Fruit.CARROT, 2);

        JuiceRecipe tropical = new JuiceRecipe("Тропический")
                .set(Fruit.ORANGE, 1)
                .set(Fruit.BANANA, 2)
                .set(Fruit.PINEAPPLE, 1);

        JuiceRecipe vitaminMix = new JuiceRecipe("Витаминный микс")
                .set(Fruit.ORANGE, 1)
                .set(Fruit.APPLE, 1)
                .set(Fruit.CARROT, 1)
                .set(Fruit.BANANA, 1);

        JuiceRecipe exotic = new JuiceRecipe("Экзотик")
                .set(Fruit.PINEAPPLE, 2)
                .set(Fruit.BANANA, 2);

        // Демонстрация приготовления
        machine.makeJuice(orangeFresh);
        System.out.println(machine);

        machine.makeJuice(tropical);
        System.out.println(machine);

        machine.makeJuice(exotic);
        System.out.println(machine);

        // Демонстрация переполнения при дозагрузке
        machine.add(Fruit.ORANGE, 20); // покажет, что часть не влезла
        System.out.println(machine.toStringEn());
    }
}
