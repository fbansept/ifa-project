package org.ifa.fbansept.zikos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ZikosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZikosApplication.class, args);
	}

}
