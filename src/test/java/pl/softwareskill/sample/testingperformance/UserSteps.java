package pl.softwareskill.sample.testingperformance;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserSteps {

    private final UserRepository userRepository;

    public User givenUser() {
        var user = new User();
        userRepository.save(user);
        return user;
    }
}
