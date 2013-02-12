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
		if(string.equals("Fighter Jet") || string.equals("Harrier")) {
			return new IFlyLikeFJ();
		}
		if(string.equals("Model")) {
			return new IDontFly();
		}
		return null;
	}

}
