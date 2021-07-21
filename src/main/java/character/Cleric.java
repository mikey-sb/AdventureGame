package character;

import weapons.Weapon;

public class Cleric extends PlayableCharacter {
    public Cleric(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.OREGANO);
    }
}
