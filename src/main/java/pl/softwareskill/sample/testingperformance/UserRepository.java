package pl.softwareskill.sample.testingperformance;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Optional.ofNullable;

@Slf4j
public class UserRepository {

    private final Map<UUID, User> map;

    public UserRepository() {
        this.map = new ConcurrentHashMap<>();

        log.info("Initializing User's repository");
    }

    public Optional<User> findById(UUID id) {
        return ofNullable(map.get(id));
    }

    public void save(User user) {
        map.put(user.getId(), user);
    }
}
