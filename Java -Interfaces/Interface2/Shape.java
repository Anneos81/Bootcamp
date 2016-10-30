package Interface2;
public class Shape implements Agreeable  {
	
	int width, height;
	Shape(){}
	Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
	int calcArea(){
		return width*height; 
		
	}
	public void isSmallerThan(Agreeable other){
		Shape kati = (Shape) other;
		if(this.calcArea() < kati.calcArea()){
			System.out.println("The kati is biger than the other!!");
		}
	}
	
}
