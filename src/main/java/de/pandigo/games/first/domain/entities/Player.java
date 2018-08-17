package de.pandigo.games.first.domain.entities;

public class Player {

    private long playerId;
    private int level;
    private int exp;

    public Player(){}

    public Player(long playerId) {
        this.playerId = playerId;
    }

    public long getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
