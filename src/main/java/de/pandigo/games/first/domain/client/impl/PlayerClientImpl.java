package de.pandigo.games.first.domain.client.impl;

import de.pandigo.games.first.domain.client.AbstractClient;
import de.pandigo.games.first.domain.client.PlayerClient;
import de.pandigo.games.first.domain.entity.Experience;
import de.pandigo.games.first.domain.entity.Player;
import de.pandigo.games.first.domain.type.CustomMediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PlayerClientImpl extends AbstractClient implements PlayerClient {

    private static final String URL_BASE_PATH_PLAYER = "http://localhost:8081/player/";
    private static final String URL_PLAYER_WITH_ID = PlayerClientImpl.URL_BASE_PATH_PLAYER + "{playerId}";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Player createPlayer() {
        return this.restTemplate.postForObject(PlayerClientImpl.URL_BASE_PATH_PLAYER, null, Player.class);
    }

    @Override
    public Player getPlayer(final long playerId) {
        return this.restTemplate.getForObject(PlayerClientImpl.URL_PLAYER_WITH_ID, Player.class, this.idAsMap("playerId", playerId));
    }

    @Override
    public Player addExpToPlayer(final long playerId, final int expAmount) {
        final HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", CustomMediaType.APPLICATION_PLAYER_ADDEXPTOPLAYER_JSON);
        final HttpEntity<Experience> entity = new HttpEntity<>(new Experience(expAmount), headers);
        return this.restTemplate.postForObject(PlayerClientImpl.URL_PLAYER_WITH_ID, entity, Player.class, this.idAsMap("playerId", playerId));
    }
}
