/**
 * 
 */
package vehicles;

/**
 * @author sward09
 *
 */
public class Airplane {
	
	private int kind;
	private Flying hIF;

	public Airplane(int i) {
		kind = i;
	}

	public Airplane(int i, Flying fly) {
		kind = i;
		hIF = fly;
	}

	public String howDoYouFly() {
		switch(kind) {
		case 1: return "Like a fighter jet";
		case 2: return "I don't fly";
		case 3: return "Like a passenger plane";
		default: return null;
		}
	}

	public String howDoYouLiftOff() {
		return hIF.howIFly();
	}

}
