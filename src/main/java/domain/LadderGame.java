package domain;

import domain.ladder.Ladder;
import domain.player.Player;
import domain.player.Players;
import domain.result.Result;
import domain.result.Results;

import java.util.LinkedHashMap;
import java.util.Map;

public class LadderGame {

    private final Map<Player, Result> playerResult = new LinkedHashMap<>();

    public LadderGame(Players players, Ladder ladder, Results results) {
        for (int start = 0; start < players.getPlayerSize(); start++) {
            int end = ladder.climb(start);

            Player player = players.getPlayers().get(start);
            Result result = results.getResults().get(end);
            playerResult.put(player, result);
        }
    }

    public Map<Player, Result> getPlayerResult() {
        return playerResult;
    }
}
