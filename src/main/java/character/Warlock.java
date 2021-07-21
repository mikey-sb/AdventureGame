package character;

import weapons.Weapon;

public class Warlock extends PlayableCharacter {
    public Warlock(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.BLOODBARRAGE);
    }
}
