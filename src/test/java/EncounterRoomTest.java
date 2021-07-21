import character.*;
import character.PlayableCharacter;
import org.junit.Before;
import org.junit.Test;
import room.EncounterRoom;

import static org.junit.Assert.assertEquals;

public class EncounterRoomTest {

    private EncounterRoom encounterRoom;
    private PlayableCharacter dwarf;
    private PlayableCharacter knight;
    private PlayableCharacter orc;
    private PlayableCharacter ogre;
    private PlayableCharacter cleric;
    private PlayableCharacter dragon;

    @Before
    public void setup() {
        encounterRoom = new EncounterRoom();
        dwarf = new Dwarf(50, 50);
        knight = new Knight(100, 40);
        orc = new Orc(25, 10);
        ogre = new Ogre(70, 30);
        cleric = new Cleric(50, 50);
        dragon = new BossyMcBossFace(500, 250);
        encounterRoom.addEnemyToRoom(orc);
        encounterRoom.addEnemyToRoom(ogre);
        encounterRoom.addPlayerToRoom(dwarf);
        encounterRoom.addPlayerToRoom(knight);
        encounterRoom.addPlayerToRoom(cleric);
        encounterRoom.addEnemyToRoom(dragon);
    }

    @Test
    public void charactersCanBeAddedToEncounterRoom(){
        assertEquals(3, encounterRoom.getRoomPlayers().size());
        assertEquals(3, encounterRoom.getRoomEnemies().size());
    }

    @Test
    public void playerKnightCanFightOrc(){
    encounterRoom.attack(knight, orc);
    assertEquals(32, knight.getPP());
    assertEquals(17, orc.getHealth());
    }

    @Test
    public void clericCanHealTeam(){
        encounterRoom.attack(orc, knight);
        encounterRoom.attack(cleric, knight);
        assertEquals(102, knight.getHealth());
    }

    @Test
    public void enemyCanBeKilled(){
        encounterRoom.attack(knight, orc);
        encounterRoom.attack(knight, orc);
        encounterRoom.attack(knight, orc);
        encounterRoom.attack(knight, orc);
        assertEquals(true, encounterRoom.isEnemyDead(orc));
    }

    @Test
    public void enemyCanBeAttackedButNotRemovedFromRoom(){
        encounterRoom.attack(knight, orc);
        assertEquals(false, encounterRoom.isEnemyDead(orc));
    }

    @Test
    public void playerCanBeKilled(){
        encounterRoom.attack(dragon, cleric);
        assertEquals(true, encounterRoom.isPlayerDead(cleric));
    }



}



