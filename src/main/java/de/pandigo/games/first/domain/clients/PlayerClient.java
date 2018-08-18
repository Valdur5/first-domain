package de.pandigo.games.first.domain.clients;

import de.pandigo.games.first.domain.entities.Player;

/**
 * Rest client for calling methods player related.
 */
public interface PlayerClient {

    /**
     * Create a new player.
     *
     * @return the newly created player object
     */
    Player createPlayer();

    /**
     * Provides the player object for the given player id.
     *
     * @param playerId The player id
     * @return The player object
     */
    Player getPlayer(long playerId);

    /**
     * Method to add experience to the player, if the player has enough experience to level up this method will
     * increase the level of the player as well.
     *
     * @param playerId  The player which should get more experience
     * @param expAmount The amount of exp the player should get
     * @return The updated player object
     */
    Player addExpToPlayer(long playerId, int expAmount);
}
