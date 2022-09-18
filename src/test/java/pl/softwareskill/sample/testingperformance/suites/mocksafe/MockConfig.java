package pl.softwareskill.sample.testingperformance.suites.mocksafe;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import pl.softwareskill.sample.testingperformance.UserRepository;

@Configuration
public class MockConfig {

    @MockBean
    UserRepository userRepository;
}
