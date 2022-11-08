package SampleCalculations;

import org.testng.annotations.Test;

public class SampleMaths {
	int i=100;
	int j=50;
	
	@Test(groups={"add"})
	public void Addition() {
		System.out.println(i+j);
	}
	@Test(groups= {"multiply"})
	public void Multiply() {
		System.out.println(i*j);
	}
	@Test(groups= {"sub"})
	public void Subtraction() {
		System.out.println(i-j);
	}
	@Test(groups= {"Div"})
	public void Division() {
		System.out.println(i/j);
	}
	@Test(groups= {"Div"})
	public void Mod() {
		System.out.println(i%j);
	}

}
