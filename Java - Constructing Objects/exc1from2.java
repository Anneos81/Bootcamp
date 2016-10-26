public class exc1from2{

	public static int bootcamp(int num1, int num2){
      if (num1<num2){
		  int b = Math.abs(num1-num2);
		  return ((int)Math.sqrt(b));
      }else{
		  return(num1+num2);
      }
    }
    public static void main(String[]args){
		System.out.print("First " + bootcamp(25,91));
	    System.out.println("  Second " + bootcamp(91,25));
	}


}
