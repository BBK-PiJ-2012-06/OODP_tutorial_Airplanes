/**
 * 
 */
package vehicles;

/**
 * @author sward09
 *
 */
public class LiftOffFactory {
	
	public LiftOff createLiftOff(String string) {
		if(string.equals("Fighter Jet")) {
			return new ILiftOffH();
		}
		if(string.equals("Harrier")) {
			return new ILiftOffV();
		}
		if(string.equals("Model")) {
			return new IDontLiftOff();
		}
		return null;
	}

}
