
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(8,10);
		Rectangle rec2 = new Rectangle(2,5);
		Rectangle rec3 = new Rectangle(8,3);
		Rectangle rec4 = new Rectangle(4,4);
		
		//Testing the functionality of the methods
		rec1.draw();
		System.out.println("Is rec2 a square? " + rec2.isSquare()); 
		System.out.println("Is rec4 a square? " + rec1.isSquare());
		System.out.println("Are rectangles rec2 and rec4 equal? " + rec2.areEqual(rec4));
		System.out.println(rec3);
		Rectangle rec10 = rec1.copy();
		System.out.println(rec10);
		
		Shape rer1 = new Rectangle(3,5);
		Rectangle rer2 = new Rectangle(3,5);
		
		System.out.println(rer2.areEqual((Rectangle)rer1));
		System.out.println(rer2.isSquare() + "\n" + ((Rectangle)rer1).isSquare());
	}

}
