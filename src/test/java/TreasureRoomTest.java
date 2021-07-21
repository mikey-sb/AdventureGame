
import character.*;
import character.PlayableCharacter;
import org.junit.Before;
import org.junit.Test;
import room.Room;
import room.TreasureRoom;
import treasure.Treasure;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    private Room treasureRoom;
    private PlayableCharacter dwarf;

    @Before
    public void setup(){
        treasureRoom = new TreasureRoom();
        dwarf = new Dwarf(50, 50);
    }

    @Test
    public void roomStartsWithEmptyListOfPlayers(){
        assertEquals(0, treasureRoom.getRoomPlayers().size());
    }

    @Test
    public void roomStartsWithEmptyListOfTreasure(){
        assertEquals(0, treasureRoom.getRoomTreasures().size());
    }

    @Test
    public void roomStartsWithEmptyListOfEnemies(){
        assertEquals(0, treasureRoom.getRoomEnemies().size());
    }

    @Test
    public void canAddEnemyToRoom(){
        treasureRoom.addEnemyToRoom(dwarf);
        assertEquals(1, treasureRoom.getRoomEnemies().size());
    }

    @Test
    public void canAddTreasureToRoom(){
        treasureRoom.addTreasureToRoom(Treasure.DIAMOND);
        assertEquals(1, treasureRoom.getRoomTreasures().size());
    }

    @Test
    public void canAddPlayerToRoom(){
        treasureRoom.addPlayerToRoom(dwarf);
        assertEquals(1, treasureRoom.getRoomPlayers().size());
    }

    @Test
    public void canRemoveTreasureFromRoom(){
        treasureRoom.addTreasureToRoom(Treasure.GOLD);
        treasureRoom.addTreasureToRoom(Treasure.SILVER);
        treasureRoom.removeTreasureFromRoom(Treasure.GOLD);
        assertEquals(1, treasureRoom.getRoomTreasures().size());
    }

    @Test
    public void canRemoveEnemyFromRoom(){
        treasureRoom.addEnemyToRoom(dwarf);
        treasureRoom.removeEnemyFromRoom(dwarf);
        assertEquals(0, treasureRoom.getRoomEnemies().size());
    }

}
