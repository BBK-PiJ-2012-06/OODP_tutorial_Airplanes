/**
 * 
 */
package vehicles;

import vehicles.Flying;

/**
 * @author sward09
 *
 */
public class ModelAirplane implements Flying {

	/* (non-Javadoc)
	 * @see vehicles.Flying#howIFly()
	 */
	@Override
	public String howIFly() {
		return "I don't fly";
	}

}
