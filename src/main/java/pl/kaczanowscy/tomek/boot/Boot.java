package pl.kaczanowscy.tomek.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Boot.class);
		app.setShowBanner(false);
		app.run(args);
//		SpringApplication.run(Boot.class, args);
	}
}
