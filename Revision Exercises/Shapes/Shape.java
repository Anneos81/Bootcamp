
public abstract class Shape {
	protected int numberOfSides;
	
	Shape(){}
	Shape(int numSides){
		this.numberOfSides = numSides;
	}
	
	public void setNumSides(int numSides){
		this.numberOfSides = numSides;
	}
	public int getNumSides(){return this.numberOfSides;}
	
	public abstract void draw();
	public abstract double area();
	public abstract double perimeter();
	public String toString(){
		return "Number of sides of this shape is: " + this.numberOfSides;
	}
	

}
