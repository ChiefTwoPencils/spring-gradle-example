import wilk.robert.sge.entities.Game;
import wilk.robert.sge.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Robert Wilk
 * on 4/16/2016.
 */
public class SpringGradleExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Game game = context.getBean("game", Game.class);
        Team team = game.play();
        System.out.println("\nAnd the winner is..." + team);
    }
}
