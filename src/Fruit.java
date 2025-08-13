// (опционально) package your.package;

public enum Fruit {
    ORANGE("апельсинов", "oranges", 10),
    APPLE("яблок", "apples", 10),
    CARROT("морковок", "carrots", 10),
    BANANA("бананов", "bananas", 10),
    PINEAPPLE("ананасов", "pineapples", 10);

    public final String ruNameGenitive; // для сообщений по-русски: "добавьте апельсинов"
    public final String enNamePlural;   // англ. мн.ч.: "oranges"
    public final int max;               // лимит для конкретного фрукта

    Fruit(String ruNameGenitive, String enNamePlural, int max) {
        this.ruNameGenitive = ruNameGenitive;
        this.enNamePlural = enNamePlural;
        this.max = max;
    }
}
