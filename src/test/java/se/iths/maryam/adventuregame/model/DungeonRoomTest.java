package se.iths.maryam.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.iths.maryam.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DungeonRoomTest {
    @Test
    public void testHasDefeatedEnemy() {
        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("a");

        Player player = new Player.Builder()
                .setName("Player")
                .setHealth(100)
                .setScore(0)
                .setStrength(10)
                .build();

        DungeonRoom dungeonRoom = new DungeonRoom();

        dungeonRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasDefeatedEnemy(), "a == defeat enemy");
    }
}