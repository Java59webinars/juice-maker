public enum Fruit {
    ORANGE("апельсинов","oranges", 10),
    APPLE("яблок","APPLE", 10),
    CARROT("морковок","CARROT", 10),
    BANANA("бананов","BANANA", 10),
    PINEAPPLE("ананасов","PINEAPPLE", 10);
    public final String ruName;
    public final String engName;
    public final int max;
    Fruit(String ruName, String engName, int max){
        this.ruName = ruName;
        this.engName=engName;
        this.max=max;
    }
}
