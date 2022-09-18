package pl.softwareskill.sample.testingperformance.suites.mocksafe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.softwareskill.sample.testingperformance.User;
import pl.softwareskill.sample.testingperformance.UserRepository;
import pl.softwareskill.sample.testingperformance.UserSettingsService;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@SpringBootTest
public class TestWithMock {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserSettingsService userSettingsService;

    @Test
    void getsDefaultCurrencyIfNotSet() {
        var user = new User();
        given(userRepository.findById(user.getId())).willReturn(Optional.of(user));

        var ccy = userSettingsService.getSelectedCurrency(user.getId());

        assertThat(ccy)
                .isEqualTo("USD");
    }
}
