package weapons;

public enum Weapon {

    SWORD(6, 7, 4, "Sword"),
    AXE(8, 5, 8, "Axe"),
    MACE(10, 7, 12, "Axe"),
    CLUB(9, 6, 10, "Club"),
    BOW(4, 9, 1, "Bow"),
    FIREBALL(5, 5, 3, "Fireball"),
    BLOODBARRAGE(9, 3, 5, "Blood Barrage"),
    OREGANO(-10, 10, 5, "Oregano"),
    POTION(-5, 10, 4, "Potion"),
    DRAGONBREATH(100, 10, 100, "Dragon Breath");


    private final int damage;
    private final int accuracy;
    private final int stamina;
    private final String name;

    Weapon(int damage, int accuracy, int stamina, String name){
        this.damage = damage;
        this.accuracy = accuracy;
        this.stamina = stamina;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }
}
