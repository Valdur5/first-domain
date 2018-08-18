package de.pandigo.games.first.domain.client;

import de.pandigo.games.first.domain.entity.map.Position;

/**
 * Rest client for calling methods map related.
 */
public interface MapClient {

    /**
     * Method for locating a object in the map.
     *
     * @param objectId The object id which should be located in the map
     * @return The Position object containing all location based information about the object
     */
    Position getPosition(long objectId);
}
