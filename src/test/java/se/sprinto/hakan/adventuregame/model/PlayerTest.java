package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void testAttack() {

        // Arrange
        Player player = new Player("Hero", 100, 0, 20);
        Enemy enemy = new Enemy("Goblin", 50, 0, 10);

        int healthBefore = enemy.getHealth();

        // Act
        player.attack(enemy);

        // Assert
        int expectedHealth = healthBefore - player.getStrength();

        assertEquals(expectedHealth, enemy.getHealth());
    }
}