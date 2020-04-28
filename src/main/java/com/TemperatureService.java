package com;

public class TemperatureService {
	
	public int tempFahrenheit(int celcius) {
		return ((9*celcius)/5)+32;
	}
	public int tempKelvin(int celcius) {
		return celcius+273;
	}
}
