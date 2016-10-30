
public class Life extends Insurance{
	private int amount; //the amount the customer decides to invest
	
	Life(int custCode,int dure, int amount){
		super(custCode,dure);
		this.amount = amount;
	}
	public int getAmount(){return this.amount;}
	public void setAmount(int amount){this.amount = amount;}
	
	@Override
	public String toString(){
		return super.toString() +  "The customer has decided to invest the" 
				+ " amount of " + this.amount + "euros.";
	}
	public int insCost(){
		return (super.insCost() + (5*this.dure)); 
	}
}