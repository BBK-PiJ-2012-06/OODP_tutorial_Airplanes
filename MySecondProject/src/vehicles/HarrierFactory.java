package vehicles;

public class HarrierFactory implements AirplaneFactory {

	/* (non-Javadoc)
	 * @see vehicles.AirplaneFactory#createFlying()
	 */
	@Override
	public Flying createFlying() {
		FlyingFactory fly = new FlyingFactory();
		return fly.createFlying("Fighter Jet");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirplaneFactory#createLiftOff()
	 */
	@Override
	public LiftOff createLiftOff() {
		LiftOffFactory lift = new LiftOffFactory();
		return lift.createLiftOff("Fighter Jet");
	}

}
