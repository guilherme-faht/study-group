package br.com.credisfera.grupo.controller;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class FlawedControllerIntegrationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(FlawedControllerIntegrationTest.class);

	@Autowired
	FlawedController myController;

	@Test
	void whenControl_ThenThrowNullPointerException() {
		NullPointerException npe = assertThrows(NullPointerException.class, () -> myController.control());
		LOGGER.error("Got a NullPointerException", npe);
	}
}
