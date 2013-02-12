package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import vehicles.Airplane;
import vehicles.Flying;
import vehicles.FlyingFactory;
import vehicles.LiftOff;
import vehicles.LiftOffFactory;
import vehicles.ModelAirplane;


public class AirplaneTest {

	private static FlyingFactory flyingFactory;
	private static LiftOffFactory liftOffFactory;

	
	@BeforeClass
	public static void onlyOnce() {
		flyingFactory = new FlyingFactory();
		liftOffFactory = new LiftOffFactory();
	}

	
	@Test
	public void test1() {
		
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = liftOffFactory.createLiftOff("Fighter Jet");
		
		Airplane classUnderTest = new Airplane(liftOff, fly);
		
		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer!", stringReturned, expectedOutput);
	}
	
	@Test
	public void test2() {
		
		String expectedOutput = "Vertically";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Harrier");
		LiftOff liftOff = liftOffFactory.createLiftOff("Harrier");
		
		Airplane classUnderTest = new Airplane(liftOff, fly);
		
		stringReturned = classUnderTest.howDoYouLiftOff();
		
		assertEquals("Wrong Answer!", stringReturned, expectedOutput);
	}
	
	@Test
	public void test3() {
		
		String expectedOutput = "I don't fly";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Model");
		LiftOff liftOff = liftOffFactory.createLiftOff("Model");
		
		Airplane classUnderTest = new Airplane(liftOff, fly);
		
		stringReturned = classUnderTest.howDoYouFly();
		
		assertEquals("Wrong Answer!", stringReturned, expectedOutput);
	}
}