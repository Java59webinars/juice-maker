import java.util.Arrays;

public class JuiceMachine {
    private final String machineName;
    private int[] stock = new int[Fruit.values().length];
    public JuiceMachine(String name){
        this.machineName = name;
    }

    @Override
    public String toString() {
        String machineStorage = " В машине " + machineName + " ";
        Fruit[] fs = Fruit.values();
        for(int i=0; i< fs.length; i++){
            machineStorage += (stock[i] + " " + fs[i].ruName + ", ");
        }
        return machineStorage;
    }

    public String toStringEn() {
        String machineStorage = " In the storage of  " + machineName + " ";
        Fruit[] fs = Fruit.values();
        for(int i=0; i< fs.length; i++){
            machineStorage += (stock[i] + " " + fs[i].engName + ", ");
        }
        return machineStorage;
    }
    public void add(Fruit f, int amount){
        int id = f.ordinal();
        int before = stock[id];
        stock[id] = Math.min(before + amount, f.max);
        int added = stock[id] - before;
        if(added < amount){
            System.out.println(" Вместо " + amount + " "+ f.ruName + " добавлено " + added);
        }
    }
}

//
//

//
//Implement methods:
//

//Implement a method "make juice":
//If there are enough resources, the machine "makes juice"
//        (prints something like: "Chopping 2 oranges, adding 1 banana... Juice ready!").
//After making juice, the resources should be decreased.
//If there are not enough resources — print exactly what needs to be added.
