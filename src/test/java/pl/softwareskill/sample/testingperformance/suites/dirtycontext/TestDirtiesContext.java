package pl.softwareskill.sample.testingperformance.suites.dirtycontext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import pl.softwareskill.sample.testingperformance.UserSettingsService;
import pl.softwareskill.sample.testingperformance.UserSteps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.annotation.DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD;

@SpringBootTest
@DirtiesContext(classMode = AFTER_EACH_TEST_METHOD)
public class TestDirtiesContext {

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

    @Test
    void getsDefaultCurrencyIfNotSet2() {
        var user = userSteps.givenUser();

        var ccy = userSettingsService.getSelectedCurrency(user.getId());

        assertThat(ccy)
                .isEqualTo("USD");
    }
}
