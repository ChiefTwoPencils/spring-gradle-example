import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import wilk.robert.sge.entities.*;

import java.util.List;

/**
 * Created by Robert Wilk
 * on 4/16/2016.
 */
@Configuration
@ComponentScan(value = "wilk.robert.sge")
public class AppConfig {

    @Autowired
    private List<Team> teams;

    @Bean
    public Game game() {
        System.out.println("Available teams: ");
        teams.forEach(System.out::println);
        return new BaseballGame(cubs(), redSox());
    }

    @Bean
    public Team cubs() {
        return new Cubs();
    }

    @Bean
    public Team redSox() {
        return new RedSox();
    }
}
