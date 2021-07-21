package character;

import weapons.Weapon;

public class Barbarian extends PlayableCharacter {
    public Barbarian(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.MACE);
    }
}
