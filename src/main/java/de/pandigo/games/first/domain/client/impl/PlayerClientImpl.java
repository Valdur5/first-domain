package de.pandigo.games.first.domain.client.impl;

import de.pandigo.games.first.domain.client.AbstractClient;
import de.pandigo.games.first.domain.client.PlayerClient;
import de.pandigo.games.first.domain.entity.player.Experience;
import de.pandigo.games.first.domain.entity.player.Player;
import de.pandigo.games.first.domain.type.CustomMediaType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
public class PlayerClientImpl extends AbstractClient implements PlayerClient {

    private static final String URL_BASE_PATH_PLAYER = "http://localhost:8081/player/";
    private static final String URL_PLAYER_WITH_ID = PlayerClientImpl.URL_BASE_PATH_PLAYER + "{playerId}";

    @Override
    public Player createPlayer() {
        return this.restTemplate.postForObject(URL_BASE_PATH_PLAYER, null, Player.class);
    }

    @Override
    public Player getPlayer(final long playerId) {
        return this.restTemplate.getForObject(URL_PLAYER_WITH_ID, Player.class, this.idAsMap("playerId", playerId));
    }

    @Override
    public Player addExpToPlayer(final long playerId, final int expAmount) {
        final HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", CustomMediaType.APPLICATION_PLAYER_ADDEXPTOPLAYER_JSON);
        final HttpEntity<Experience> entity = new HttpEntity<>(new Experience(expAmount), headers);
        return this.restTemplate.postForObject(URL_PLAYER_WITH_ID, entity, Player.class, this.idAsMap("playerId", playerId));
    }
}
