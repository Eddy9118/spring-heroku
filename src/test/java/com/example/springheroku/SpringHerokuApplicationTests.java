package com.example.springheroku;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringHerokuApplicationTests {

	@Test
	void contextLoads() {

		System.getenv().forEach(
				(key, value) -> System.out.println( key + " " + value)
		);
	}

}
