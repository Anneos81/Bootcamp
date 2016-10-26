
public class Bootcamp {
	public static void welcome(double number) throws Exception{
		if (number>25.0){
			throw new DigitException();
		}else{
			throw new AnotherDigitException();
		}
	}
	 public static int bye() throws Exception{
		try{welcome(299.7);return 0;}
		catch(DigitException e){return 605;}
		catch(AnotherDigitException e){return 230;}
	 }
	 public static void main(String args []) throws Exception{
		 System.out.println(bye());
	 }
}