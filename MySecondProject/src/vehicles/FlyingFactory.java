/**
 * 
 */
package vehicles;

/**
 * @author sward09
 *
 */
public class FlyingFactory {

	public Flying createFlying(String string) {
		if(string.equals("Fighter Jet")) {
			return new FFJ();
		}
		return null;
	}

}
