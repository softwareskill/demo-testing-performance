package pl.softwareskill.sample.testingperformance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    UserSteps userSteps(UserRepository userRepository) {
        return new UserSteps(userRepository);
    }
}
