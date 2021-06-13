package com.alx.springtravisci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringtravisciApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(1, 2, "test failing for CI test purpose");
	}

}
