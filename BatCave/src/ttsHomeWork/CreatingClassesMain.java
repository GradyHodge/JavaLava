//1. Create a human Class with atleast 5 attributes and functions
//2. Create a Car Class with atleast 5 attributes and 3 functions
//3. Create a Dragon Class with atleast 5 attributes and 3 functions
package ttsHomeWork;

public class CreatingClassesMain {

	
//	public void sayMyName() {
//		System.out.println("Your pokemon's name is" + pikachu.name  + "and your power level is " + pikachu.attackPower);
//	}
	
	public static void main(String[] args) {
	 //TODO Auto-generated method stub
//create an new instance of a CarClassHmwk = a new object, and name it.
		//you can call the new creation below an "instance" or an "object"
//copy name of new class into your class with the main method.
// format: nameOfClass nameInstance = new nameOfClass();
		
		
		
		Pokemon pikachu = new Pokemon("pikachu", 200, 100, "electric", "grass", 100);
		Pokemon squirtle = new Pokemon("squirty", 100, 300, "water", "pond", 100);
		Pokemon rocket = new Pokemon("bad guy", 300, 200, "rock", "mountain", 100);
		
//		this.name = Name;
//		this.attackPower = AttackPower;
//		this.defensePoints = defensePoints;
//		this.elemental = elemental;
//		this.enviroAdvant = enviroAdvant;
		
		pikachu.lazyBoy(5);
		pikachu.feedMe(3);
		pikachu.goTrain(2);
		pikachu.facePalm(2);
		
		
		
		//DragonClass sender = new DragonClass("Cinder", 300, "ice", 500, 1000, 3, 1);
	//		String name;
	//		int wingSpan;
	//		String elemental;
	//		int health;
	//		int armor;
	//		int attakpts;
	//		int lvl;
	}	
}
//		HumanClass gifford = new HumanClass(2, true, "man", 2, "Klingon");
//		
//		HumanClass hoodie = new HumanClass();
//			hoodie.eyes; //how to seta default constant in the class
//			hoodie.coder = true;
//			hoodie.gender = man;
//			hoodie.legs = 2;
//			hoodie.languages = "Klingon";
//			
//	//		int eyes = 2;
//	//		boolean coder;
//	//		String gender;
//	//		int legs;
//	//		String languages;
		CarClassHmwk bumbleBee = new CarClassHmwk();
		
			this.id = 1234;
			this.model = "Toyota";
			this.make = "Prius";
			this.yearMade = 2019;
			this.transformer = true;
			
			System.out.println("It's " + bumbleBee.transformer + ", this " + bumbleBee.make + " is a robot in disguise!");
	
			CarClassHmwk primus = new CarClassHmwk();
			
			primus.setId(4445);
			primus.setModel("Mac");
			primus.setMake("18-wheeler");
			primus.setTransformer(true);
			
			System.out.println("It's also " + primus.getTransformer() + " Primus is a robot that turns into a Big " + primus.getModel() + " " + primus.getMake());
	}
	
//
//}
