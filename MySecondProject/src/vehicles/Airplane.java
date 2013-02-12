/**
 * 
 */
package vehicles;

/**
 * @author sward09
 *
 */
public class Airplane {
	
	private Flying hIF;
	private LiftOff hIL;

	public Airplane(LiftOff lift, Flying fly) {
		hIF = fly;
		hIL = lift;
	}

	public String howDoYouFly() {
		return hIF.howIFly();
	}

	public String howDoYouLiftOff() {
		return hIL.howILiftOff();
	}

}
