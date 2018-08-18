package de.pandigo.games.first.domain.entity.player;

import de.pandigo.games.first.domain.entity.GameObject;

public class Player extends GameObject {

    private int level;
    private int exp;

    public Player() {
    }

    public Player(final long id) {
        this.id = id;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(final int level) {
        this.level = level;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(final int exp) {
        this.exp = exp;
    }

}
