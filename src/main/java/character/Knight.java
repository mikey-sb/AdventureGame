package character;

import weapons.Weapon;

public class Knight extends PlayableCharacter {

    public Knight(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.AXE);
    }


}
