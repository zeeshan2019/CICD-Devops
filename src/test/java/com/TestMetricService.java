package com;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.MetricService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMetricService {

	int l=40;
	int b=30;
	
	MetricService m = new MetricService();
	
	@Test
	public void testArea() {
		Assertions.assertEquals(1200,m.Area(l,b));
	}
	
	@Test
	public void testKelvin() {
		Assertions.assertEquals(140,m.Perimeter(l,b));
	}
}