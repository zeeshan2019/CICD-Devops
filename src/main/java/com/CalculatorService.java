package com;

public class CalculatorService {
	
	public int Sum(int a, int b) {
		return a+b;
	}
	public int Diff(int a, int b) {
		return a-b;
	}
	public int Prod(int a, int b) {
		return a*b;
	}
	public int Mod(int a, int b) {
		return a%b;
	}
	public int Greater(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
}
