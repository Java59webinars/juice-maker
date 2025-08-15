

public class JuiceRecipe {
    private final String recipeName;
    private final int[] need = new int[Fruit.values().length];

    public JuiceRecipe(String recipeName){
        this.recipeName = recipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public JuiceRecipe set (Fruit f, int amount){
        need[f.ordinal()] = amount;
       // JuiceRecipe recipe = this;
        return this;
    }

    public int[] getAllFruitInRecipe(){
        return java.util.Arrays.copyOf(need, need.length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Рецепт сока: " + recipeName+ ": ");
        for (Fruit f : Fruit.values()){
            int i = f.ordinal();
            if (need[i] > 0){
                sb.append(f.ruName).append(" ").append(need[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
