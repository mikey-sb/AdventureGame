package character;
import character.PlayableCharacter;
import weapons.Weapon;

public class BossyMcBossFace extends PlayableCharacter {
    public BossyMcBossFace(int health, int pp) {
        super(health, pp);
        weapons.add(Weapon.DRAGONBREATH);
    }
}

