package se.iths.maryam.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.iths.maryam.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ForestRoomTest {
    @Test
    public void testHasFoundKey() {
        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("ja");

        Player player = new Player.Builder()
                .setName("Player")
                .setHealth(100)
                .setScore(0)
                .setStrength(10)
                .build();

        ForestRoom forestRoom = new ForestRoom();

        forestRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasFoundKey(), "Key is found");
    }
}

