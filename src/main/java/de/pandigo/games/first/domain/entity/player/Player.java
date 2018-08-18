package de.pandigo.games.first.domain.entity.player;

public class Player {

    private long playerId;
    private int level;
    private int exp;

    public Player() {
    }

    public Player(final long playerId) {
        this.playerId = playerId;
    }

    public long getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(final long playerId) {
        this.playerId = playerId;
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
