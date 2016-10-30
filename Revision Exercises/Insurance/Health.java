
public class Health extends Insurance{
	protected int medExp; //the medical expense the customer wants
	
	//Construstors
	Health(int custCode, int dure, int medExp){
		super(custCode, dure);
		this.medExp = medExp;
	}	
	public int getMedExp(){return this.medExp;}
	public void setMedExp(int medExp){this.medExp = medExp;}
	
	@Override
	public String toString(){
		return super.toString() +  "And the medical expense the customer wants is " 
				+ this.medExp +"euros."; 
	}
	public int insCost(String sex){
		if (sex.equals("man")||sex.equals("Man")){
			return 150 + (7*this.dure); 
		}else{
			return 100 + (7*this.dure);
		}
	}
}