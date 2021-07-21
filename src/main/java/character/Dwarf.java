package character;

import weapons.Weapon;

public class Dwarf extends PlayableCharacter {

    public Dwarf(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.CLUB);
    }
}
