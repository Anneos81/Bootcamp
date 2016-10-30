
public class Customer {
	private  int custCode;
	private String name;
	private int yearB;
	private String sex;
	private static int counter = 0;
	
	Customer(String name, String sex, int yearB){
		this.name = name;
		this.yearB = yearB;
		this.sex = sex;
		counter++;
		this.custCode = counter;		
	}
	
	public int getCode(){return this.custCode;} 
	public int getYearB(){return this.yearB;}
	public String getName(){return this.name;}
	public String getSex(){return this.sex;}
	public void setCode(int custCode){this.custCode =custCode;}
	public void setYearB(int yearB){this.yearB = yearB;}
	public void setName(String name){this.name = name;}
	public void setSex(String sex){this.sex = sex;}
	
	@Override
	public String toString(){
		return "This is the customer " + this.name + " with code "
				+ this.custCode + " and year of Birth " + this.yearB
				+". Sex : " + this.sex ;
	}
}