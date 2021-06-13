package com.alx.springtravisci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringtravisciApplicationTests {

	@Test
	@Disabled
	void contextLoads() {
		assertEquals(1, 2, "test failing for CI test purpose");
	}

}
