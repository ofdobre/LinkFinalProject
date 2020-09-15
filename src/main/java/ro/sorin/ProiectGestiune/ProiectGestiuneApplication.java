package ro.sorin.ProiectGestiune;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ProiectGestiuneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProiectGestiuneApplication.class, args);
	}

}
