// (опционально) package your.package;

public class Main {
    public static void main(String[] args) {
        JuiceMachine machine = new JuiceMachine("SuperJuiceMaker");
        machine.add(Fruit.APPLE, 3);
        System.out.println(machine);
        System.out.println(machine.toStringEn());
        machine.add(Fruit.APPLE, 10);
        System.out.println(machine);
        System.out.println(machine.toStringEn());
        JuiceRecipe tropical = new JuiceRecipe("Тропический");
        tropical.set(Fruit.ORANGE, 1);
        tropical.set(Fruit.BANANA,1);
        tropical.set(Fruit.PINEAPPLE,1);
        System.out.println(tropical);
        JuiceRecipe appleCarrot = new JuiceRecipe("Яблочно-морковный")
                .set(Fruit.APPLE, 2)
                .set(Fruit.CARROT, 2);
        System.out.println(appleCarrot);
        JuiceRecipe orangeFresh = new JuiceRecipe("Апельсиновый фрэш")
                .set(Fruit.ORANGE, 3);
        System.out.println(orangeFresh);
        machine.makeJuice(tropical);
        machine.add(Fruit.ORANGE, 5);
        machine.add(Fruit.BANANA, 5);
        machine.add(Fruit.PINEAPPLE, 5);
        machine.makeJuice(tropical);
        System.out.println(machine);
        machine.makeJuice(appleCarrot);
        machine.makeJuice(orangeFresh);
        System.out.println(machine.toStringEn());
    }
}
