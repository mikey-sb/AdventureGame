package character;

import weapons.Weapon;

public class Wizard extends PlayableCharacter {
    public Wizard(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.FIREBALL);
    }
}
