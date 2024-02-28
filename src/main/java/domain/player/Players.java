package domain.player;

import java.util.List;

public class Players {

    private static final int MIN_PLAYER_SIZE = 2;

    private final List<Player> players;

    public Players(List<String> playerNames) {
        validatePlayerSize(playerNames);
        validateDuplicated(playerNames);

        this.players = convertToPlayer(playerNames);
    }

    private void validatePlayerSize(List<String> names) {
        if (names.size() < MIN_PLAYER_SIZE) {
            throw new IllegalArgumentException(String.format("사용자는 최소 %d명이어야 합니다.", MIN_PLAYER_SIZE));
        }
    }

    private void validateDuplicated(List<String> names) {
        if (getUniqueSize(names) != names.size()) {
            throw new IllegalArgumentException("사용자는 중복될 수 없습니다.");
        }
    }

    private long getUniqueSize(List<String> names) {
        return names.stream().distinct().count();
    }

    private List<Player> convertToPlayer(List<String> names) {
        return names.stream()
                .map(name -> new Player(name.trim()))
                .toList();
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public List<String> getPlayerNames() {
        return this.players.stream()
                .map(Player::getName)
                .toList();
    }

    public int getPlayerSize() {
        return this.players.size();
    }
}
