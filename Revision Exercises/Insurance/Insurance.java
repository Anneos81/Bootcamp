
public class Insurance {
	protected int insCode;
	protected int custCode;
	protected static int counter=0;
	protected int dure;//duration in years
	
	
	Insurance(int custCode, int dure){
		counter++ ; //auto-increment
		this.insCode = counter;
		this.custCode =custCode;
		this.dure = dure;
	}
	
	public int getCode(){return this.custCode;}
	public int getInsCode(){return this.insCode;} 
	public int getDure(){return this.dure;}
	
	public void setCode(int custCode){this.custCode =custCode;}
	public void setInsCode(int insCode){this.insCode =insCode;}
	public void setDure(int yearB){this.dure = dure;}

	public String toString(){
		return "Insurance " + this.insCode + " of customer code"
				+ this.custCode + " and duration " + this.dure
				+ " years. ";
	}
	
	public int insCost(){
		return 100; 
	}
	public static void printAll(){
		for(int i=0; i< TestInsurance.insurat.length; i++){
			System.out.println(TestInsurance.insurat[i].toString());
		}
	}
	public void printIns(int insCode){
		for(int i=0; i<TestInsurance.insurat.length; i++){
			if (TestInsurance.insurat[i].getInsCode()== insCode){
				System.out.println(TestInsurance.insurat[i].toString());
			}//else if((i== TestInsurance.insurat.length -1) && (TestInsurance.insurat[i].getInsCode()!= insCode)){System.out.println("Code not valid");}
		}
	}
	
	public void printInsCode(int custCode){
		for(int i=0; i<TestInsurance.insurat.length; i++){
			if (TestInsurance.insurat[i].getCode()== custCode){
				System.out.println(TestInsurance.insurat[i].toString());
			}//else if((i== TestInsurance.insurat.length -1) && (TestInsurance.insurat[i].getCode()!= custCode)){System.out.println("Code not valid");}
		}
	}
}