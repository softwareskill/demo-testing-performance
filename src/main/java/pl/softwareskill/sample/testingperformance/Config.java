package pl.softwareskill.sample.testingperformance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    UserSettingsService userSettingsService(UserRepository userRepository, @Value("${currency.default}") String defaultCurrency) {
        return new UserSettingsService(userRepository, defaultCurrency);
    }
}
