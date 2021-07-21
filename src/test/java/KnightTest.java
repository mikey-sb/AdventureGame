import character.Dwarf;
import character.Knight;
import org.junit.Before;
import org.junit.Test;
import treasure.Treasure;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Treasure treasure;
    private Dwarf dwarf;

    @Before
    public void setup() {
        knight = new Knight(100, 50);
        dwarf = new Dwarf(50, 50);

    }

    @Test
    public void knightHasHealth() {
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void knightHasPP() {
        assertEquals(50, knight.getPP());
    }

    @Test
    public void knightHasAxe() {
        assertEquals(Weapon.AXE, knight.getWeapons().get(0));
    }

    @Test
    public void knightCanLoseHealth() {
        knight.lowerHealth(20);
        assertEquals(80, knight.getHealth());
    }

    @Test
    public void knightCanGainHealth(){
        knight.raiseHealth(10);
        assertEquals(110, knight.getHealth());
    }

    @Test
    public void knightCanLowerStamina(){
        knight.lowerStamina(10);
        assertEquals(40, knight.getPP());
    }

    @Test
    public void usingWeaponWillDrainStamina(){
        knight.useWeapon(dwarf);
        assertEquals(42, knight.getPP());
    }

    @Test
    public void canRaiseStamina(){
        knight.raiseStamina(10);
        assertEquals(60, knight.getPP());
    }

    @Test
    public void canAddTreasureToInventory(){
        knight.addTreasureToInventory(Treasure.DIAMOND);
        assertEquals(true, knight.getTreasures().contains(Treasure.DIAMOND));
    }

    @Test
    public void canAddMultipleTreasuresToInventory(){
        knight.addTreasureToInventory(Treasure.DIAMOND);
        knight.addTreasureToInventory(Treasure.GOLD);
        assertEquals(2, knight.getTreasures().size());
    }

    @Test
    public void attackWillDrainEnemyHealth(){
        knight.useWeapon(dwarf);
        assertEquals(42, dwarf.getHealth());
    }


}


