package character;

import weapons.Weapon;

public class Orc extends PlayableCharacter {
    public Orc(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.AXE);

    }

}
