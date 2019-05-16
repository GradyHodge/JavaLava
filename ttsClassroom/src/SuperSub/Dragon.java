package SuperSub;

public class Dragon {

	int scales;
	int firePower;
	private final static boolean LIVE_BIRTH = false;
	private final static boolean LACTATION = false;
	private int numOfLimbs;
	
	public boolean isLACTATION() {
		return this.LACTATION;
	}
	
	public int getFirePower() {
		return firePower;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}

	Dragon(int scales, int firePower){
		this.scales = scales;
		this.firePower = firePower;
	}
	
	public void attackTheNorth() {
		System.out.println("Your draggon just attacked the North!");
		System.out.println("FirePower has decreased");
		System.out.println("FirePower is now" + this.firePower);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dragon spyro = new Dragon(10000, 250);
		spyro.attackTheNorth();
		
		spyro.isLACTATION();
		super.isLACTATION();
	}

}
