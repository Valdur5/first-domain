package de.pandigo.games.first.domain.entity;

/**
 * This interface marks all objects which can be interacted with inside the game.
 * Examples are: The Player, NPCs, Items like Swords or a Bench on the ground.
 */
public abstract class GameObject {

    protected long id;

    /**
     * Every object in the game has an unique id, this can be requested with this method.
     *
     * @return The unique id of an object.
     */
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
