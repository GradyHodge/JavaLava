package bamazon;

public class customer {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFunds() {
		return funds;
	}

	public void setFunds(int funds) {
		this.funds = funds;
	}

	private int funds;
	
	public customer(String name, int funds) {
		this.name = name;
		this.funds = funds;
	}
	
	public static customer createNewCustomer(String name, int funds){
		customer beyonce = new customer(name, funds);
		
		return beyonce;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//endMain

}//endClass
