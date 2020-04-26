package agprojects.pokerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokerappApplication.class, args);
        System.out.println("Poker App is running");
	}

}
