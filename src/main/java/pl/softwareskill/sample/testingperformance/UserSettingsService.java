package pl.softwareskill.sample.testingperformance;

import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class UserSettingsService {

    private final UserRepository userRepository;
    private final String defaultCcy;

    public String getSelectedCurrency(UUID userId) {
        return userRepository.findById(userId)
                .map(User::getPreferences)
                .flatMap(props -> Optional.ofNullable(props.getProperty("currency")))
                .orElse(defaultCcy);
    }
}
