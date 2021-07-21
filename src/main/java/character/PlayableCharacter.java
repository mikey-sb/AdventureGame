package character;

import treasure.Treasure;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class PlayableCharacter {

    int health;
    int pp;
    ArrayList<Weapon> weapons;
    ArrayList<Treasure> treasures;

    public PlayableCharacter(int health, int pp) {
        this.health = health;
        this.pp = pp;
        this.weapons = new ArrayList<>();
        this.treasures = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }

    public int getPP() {
        return pp;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void lowerHealth(int amount){
        this.health -= amount;
    }

    public void raiseHealth(int amount){
        this.health += amount;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public void lowerStamina(int amount){
        this.pp -= amount;
    }

    public void raiseStamina(int amount){
        this.pp += amount;
    }

    public void useWeapon(PlayableCharacter target){
        this.pp -= weapons.get(0).getStamina();
        target.health -= weapons.get(0).getDamage();
    }

    public void addTreasureToInventory(Treasure treasure){
        this.treasures.add(treasure);
    };
}
