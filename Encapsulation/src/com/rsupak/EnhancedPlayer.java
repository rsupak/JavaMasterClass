package com.rsupak;

public class EnhancedPlayer {
    private String name;
    private int hitPoints;
    private String weapon;


    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.hitPoints = (health > 0 && health <= 100) ? health : 100;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
