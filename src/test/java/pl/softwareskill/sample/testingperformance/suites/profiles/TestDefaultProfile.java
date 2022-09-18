package pl.softwareskill.sample.testingperformance.suites.profiles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.softwareskill.sample.testingperformance.UserSettingsService;
import pl.softwareskill.sample.testingperformance.UserSteps;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestDefaultProfile {

    @Autowired
    UserSteps userSteps;

    @Autowired
    UserSettingsService userSettingsService;

    @Test
    void getsDefaultCurrencyIfNotSet() {
        var user = userSteps.givenUser();

        var ccy = userSettingsService.getSelectedCurrency(user.getId());

        assertThat(ccy)
                .isEqualTo("USD");
    }
}
