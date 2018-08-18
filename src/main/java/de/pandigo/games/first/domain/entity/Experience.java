package de.pandigo.games.first.domain.entity;

public class Experience {

    private int amount;

    public Experience() {
    }

    public Experience(final int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }
}
