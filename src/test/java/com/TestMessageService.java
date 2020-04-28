package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	MessageService ms = new MessageService();
	@Test
	public void testMessage() {
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	@Test
	public void testGM() {
		Assertions.assertEquals(ms.saygm(), "Good morning");
	}
}