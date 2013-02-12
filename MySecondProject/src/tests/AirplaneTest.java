package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import vehicles.Airplane;
import vehicles.FFJ;
import vehicles.Flying;
import vehicles.FlyingFactory;
import vehicles.ModelAirplane;


public class AirplaneTest {

	private static FlyingFactory flyingFactory;
	
	@BeforeClass
	public static void onlyOnce() {
		flyingFactory = new FlyingFactory();
	}
	
	@Test
	public void test1() {
		
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Fighter Jet");
		
		Airplane classUnderTest = new Airplane(1, fly);
		
		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer!", stringReturned, expectedOutput);
	}
	
	@Test
	public void test2() {
		
		String expectedOutput = "Vertically";
		String stringReturned = null;
		
		Airplane classUnderTest = new Airplane(1);
		
		stringReturned = classUnderTest.howDoYouLiftOff();
		
		assertEquals("Wrong Answer!", stringReturned, expectedOutput);
	}
	
	@Test
	public void test3() {
		
		String expectedOutput = "I don't fly";
		String stringReturned = null;
		
		Flying fly = new ModelAirplane();
		
		Airplane classUnderTest = new Airplane(2, fly);
		
		stringReturned = classUnderTest.howDoYouFly();
		
		assertEquals("Wrong Answer!", stringReturned, expectedOutput);
	}
}