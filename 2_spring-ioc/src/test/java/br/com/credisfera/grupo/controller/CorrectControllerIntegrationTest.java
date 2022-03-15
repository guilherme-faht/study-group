package br.com.credisfera.grupo.controller;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CorrectControllerIntegrationTest {

	@Autowired
	CorrectController controller;

	@Test
	void whenControl_ThenRunSuccessfully() {
		assertDoesNotThrow(() -> controller.control());
	}
}
