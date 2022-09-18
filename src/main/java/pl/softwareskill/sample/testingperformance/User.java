package pl.softwareskill.sample.testingperformance;

import lombok.Value;

import java.util.Properties;
import java.util.UUID;

@Value
public class User {

    UUID id = UUID.randomUUID();
    Properties preferences = new Properties();
}
