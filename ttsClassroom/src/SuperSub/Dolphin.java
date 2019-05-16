package SuperSub;

public class Dolphin extends Mammal{

//set class attributes
	
	private String name;
	private int fins;
	private int stamina;
	private int speed;
	
//create class constructor
	
	Dolphin (int fins, int stamina, int speed) {
		this.name = name;
		this.fins = fins;
		this.stamina = stamina;
		this.speed = speed;
	}
	
//create class methods
	
	public void swim() {
		this.stamina -= 5;
		this.speed += 3;
		System.out.println("as a dolphin's swim speed increases, its stamina decreases");
	}
	
	public void echoLocation() {
		this.stamina -= 10;
		
	}
	@Override //best practice is to add @Override comment before methods, (has to take a parameter to work).
	public void breathOxy(String x) {
		this.stamina -= 2;
		System.out.println(this.name + "jumps out of the ocean to breath");
		
	}
	//swim(){
		
	//}
	
	//echo_location()
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dolphin dolphin1 = new Dolphin(3, 100, 25);
		dolphin1.breathOxy();
		System.out.println(dolphin1.isLiveBirth());
				
	}

}
