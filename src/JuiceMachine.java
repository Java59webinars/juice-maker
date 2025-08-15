

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

    public void makeJuice(JuiceRecipe recipe){
        System.out.println("Готовлю сок: " + recipe.getRecipeName());
        if (!checkFruitQuantity(recipe)) return;
        for (Fruit f: Fruit.values()){
            int i=f.ordinal();
            int fruitInRecipe = recipe.getAllFruitInRecipe()[i];
            if(fruitInRecipe > 0){
                System.out.println(" Обрабатываем " + fruitInRecipe + " " + f.ruName);
                stock[i] -= fruitInRecipe;
            }
        }
        System.out.println("Сок готов, приятного аппетита!");
    }

    private boolean checkFruitQuantity(JuiceRecipe recipe) {
        boolean fruitOk = true;
        for(Fruit f: Fruit.values()){
            int i=f.ordinal();
            if(stock[i]< recipe.getAllFruitInRecipe()[i]){
                System.out.println("Недостаточно: " + f.ruName + "  добавьте "  + (recipe.getAllFruitInRecipe()[i]-stock[i]) +  " штук") ;
                fruitOk = false;
            }
        }
        return fruitOk;
    }
}






