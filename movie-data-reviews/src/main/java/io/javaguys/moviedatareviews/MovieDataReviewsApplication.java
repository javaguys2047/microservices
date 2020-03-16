package io.javaguys.moviedatareviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.javaguys")
@SpringBootApplication
public class MovieDataReviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDataReviewsApplication.class, args);
	}

}
