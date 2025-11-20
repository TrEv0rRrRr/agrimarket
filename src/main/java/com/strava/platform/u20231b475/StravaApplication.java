package com.strava.platform.u20231b475;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StravaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StravaApplication.class, args);
	}

}
