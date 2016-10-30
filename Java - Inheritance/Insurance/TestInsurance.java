import java.util.*;

public class TestInsurance {

	public static Insurance smth = new Insurance(10, 2);
	public static Insurance[] insurat = new Insurance[8];
	public static Customer[] customs = new Customer[8];

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		customs[0] = new Customer("Anna","woman",1988);
		customs[1] = new Customer("Takis","man",1954);
		customs[2] = new Customer("Maria","woman",1978);
		customs[3] = new Customer("Niki","woman",1982);
		customs[4] = new Customer("Lakis","man",1984);
		customs[5] = new Customer("Lukas","Man",1998);
		customs[6] = new Customer("Pipis","man",2001);
		customs[7] = new Customer("Anivas","man",1920);
		
		insurat[0] = new Life(1, 5, 500);
		insurat[1] = new Life(2, 10, 20);
		insurat[2] = new Life(3, 3, 1000);
		insurat[3] = new Life(4, 1, 200);
		insurat[4] = new Health(5, 2, 330);
		insurat[5] = new Health(6, 15, 700);
		insurat[6] = new Health(7, 9, 2000);
		insurat[7] = new Health(8, 6, 700);
		
		int choice;
		do {
			System.out.println("***** Menu ****** \n 1.Print all Insurances"
					+ "\n 2.Search insurances by customer code \n 3.Search insurances by insurance code");
			choice = input.nextInt();
			if (choice != 1 && choice != 2 && choice != 3) {
				System.out.println("Please choose one of three choices!!");
				choice = input.nextInt();
			}
			switch (choice) {
			case 1:
				Insurance.printAll();
				break;
			case 2:
				System.out.println("Give the code of the customer to see all insurances:");
				int code = input.nextInt();
				for(int i=0; i<customs.length; i++){
					if (code==customs[i].getCode()){
						smth.printInsCode(customs[i].getCode());
					}
				}
				break;
			case 3:
				System.out.println("Give the code of the insurance:");
				int code1 = input.nextInt();
				smth.printIns(code1);
				break;
			}
		} while (choice != 0);
	}
}
