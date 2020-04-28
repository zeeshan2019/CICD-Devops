package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {

	int x=10;
	int y=6;
	
	CalculatorService c = new CalculatorService();
	
	@Test
	public void testSum() {
		Assertions.assertEquals(16,c.Sum(x,y));
	}
	
	@Test
	public void testDiff() {
		Assertions.assertEquals(4,c.Diff(x,y));
	}
	@Test
	public void testProd() {
		Assertions.assertEquals(60,c.Prod(x,y));
	}
	
	@Test
	public void testMod() {
		Assertions.assertEquals(4,c.Mod(x,y));
	}
	
	@Test
	public void testGreater() {
		Assertions.assertEquals(10,c.Greater(x,y));
	}
}
