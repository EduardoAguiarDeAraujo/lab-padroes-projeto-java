package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializer
 * Os seguintes módulos foram adicionados:
 *  - Sprint Web
 *  - Sprint Data JPA
 *  - H2 Database
 *  -OpenFeign
 *
 * @author Eduardo Araujo
 *
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
