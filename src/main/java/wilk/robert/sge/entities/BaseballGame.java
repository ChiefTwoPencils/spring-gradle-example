package wilk.robert.sge.entities;

import org.springframework.stereotype.Component;

/**
 * Created by Robert Wilk
 * on 4/16/2016.
 */
@Component
public class BaseballGame implements Game {

    private Team home;
    private Team away;

    public BaseballGame() {
        home = new Cubs();
        away = new RedSox();
    }

    public BaseballGame(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    @Override
    public Team play() {
        return Math.random() >= .50 ? home : away;
    }
}
