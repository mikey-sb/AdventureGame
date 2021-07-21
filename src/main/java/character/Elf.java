package character;

import weapons.Weapon;

public class Elf extends PlayableCharacter {
    public Elf(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.BOW);
    }
}
