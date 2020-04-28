package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.TemperatureService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestTemperatureService {

	int celcius=-40;
	
	TemperatureService t = new TemperatureService();
	
	@Test
	public void testFahrenheit() {
		Assertions.assertEquals(-40,t.tempFahrenheit(celcius));
	}
	
	@Test
	public void testKelvin() {
		Assertions.assertEquals(233,t.tempKelvin(celcius));
	}
}