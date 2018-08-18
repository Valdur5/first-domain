package de.pandigo.games.first.domain.client.impl;

import de.pandigo.games.first.domain.client.AbstractClient;
import de.pandigo.games.first.domain.client.MapClient;
import de.pandigo.games.first.domain.entity.map.Position;
import org.springframework.stereotype.Component;

@Component
public class MapClientImpl extends AbstractClient implements MapClient {

    private static final String URL_BASE_PATH_MAP = "http://localhost:8082/map/";
    private static final String URL_MAP_WITH_ID = URL_BASE_PATH_MAP + "{objectId}";

    @Override
    public Position getPosition(final long objectId) {
        return this.restTemplate.getForObject(URL_MAP_WITH_ID, Position.class, this.idAsMap("objectId", objectId));
    }
}
