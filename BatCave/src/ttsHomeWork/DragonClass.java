package ttsHomeWork;

public class DragonClass {

	String name;
	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String getElemental() {
		return elemental;
	}

	public void setElemental(String elemental) {
		this.elemental = elemental;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getAttackpts() {
		return attackpts;
	}

	public void setAttackpts(int attackpts) {
		this.attackpts = attackpts;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	int wingSpan;
	String elemental;
	int health;
	int armor;
	int attackpts;
	int lvl;
	
	DragonClass(String name, int wingSpan, String elements, int armor, int attackpts, int lvl, int wisdom){
		
		this.name = name;
		this.wingSpan = wingSpan;
		this.elemental = elemental;
		this.health = health;
		this.armor = armor;
		this.attackpts = attackpts;
		this.lvl = lvl;
		this.wisdom = wisdom;
	
	}
	
	public void tellmeAboutYourself() {
		System.out.println("The dragon's name is" + this.name);
		System.out.println("The dragon's wingspan is" + this.wingSpan);
		System.out.println("The dragon's elemental power is" + this.elemental);
	}
	
	public void goToSchool() {
		this.wisdom += 5;
		System.out.println("You increased your wisdom points by " + this.wisdom );
	}
	
	public String specialAttack() {
		System.out.println("judo chop");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		draco.gotToSchool();
		draco.tellMeAboutYourself();
		DragonClass draco = new DragonClass("Draco", 300, "ice", 100, 300, 25, 1;)
	}

}


