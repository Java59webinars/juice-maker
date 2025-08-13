// (опционально) package your.package;

public class Main {
    public static void main(String[] args) {
        JuiceMachine machine = new JuiceMachine("SuperJuiceMaker");
        machine.add(Fruit.APPLE, 3);
        System.out.println(machine.toString());
        System.out.println(machine.toStringEn());
        machine.add(Fruit.APPLE, 10);
        System.out.println(machine.toString());
        System.out.println(machine.toStringEn());
    }
}
