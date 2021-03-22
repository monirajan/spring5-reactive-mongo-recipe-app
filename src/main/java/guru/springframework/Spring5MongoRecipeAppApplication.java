package guru.springframework;

import guru.springframework.repositories.reactive.CategoryReactiveRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan(basePackages = {"guru.springframework.repositories.*"})
@SpringBootApplication
public class Spring5MongoRecipeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5MongoRecipeAppApplication.class, args);
	}
}
