import character.Cleric;
import character.Knight;
import org.junit.Before;
import org.junit.Test;

public class ClericTest {

    Cleric cleric;
    Knight knight;

    @Before
    public void setup(){
        cleric = new Cleric(70, 100);
        knight = new Knight(100, 50);
    }

    @Test
    public void clericCanBoostHealth(){
        cleric.useWeapon(knight);

    }
}
