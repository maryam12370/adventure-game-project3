package se.iths.maryam.adventuregame.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerAttackTest {

    @Test
    public void testPlayerAttackEnemy() {

        Player player = new Player.Builder()
                .setName("Player")
                .setHealth(100)
                .setScore(0)
                .setStrength(10)
                .build();

        Enemy enemy = new Enemy("Enemy", 100, 0, 10);
        int expectedHP = enemy.getHealth() - player.getStrength();

        player.attack(enemy);

        assertEquals(expectedHP, enemy.getHealth(), "Enemy health decreased");
    }
}