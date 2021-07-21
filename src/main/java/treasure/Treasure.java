package treasure;

public enum Treasure {

    GOLD(10, "Gold"),
    SILVER(2, "Silver"),
    CHALICE(25, "Chalice"),
    DIAMOND(50, "Diamond");

    private final int value;
    private final String name;

    Treasure(int value, String name){
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
