package com.cognizant.orm_learn;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrmLearnApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void checkLoggerInMain() throws Exception{
		String str=Files.readString(Paths.get("src/main/java/com/cognizant/orm_learn/OrmLearnApplication.java"));
		assertTrue(str.contains("Logger"));
	}
}
