
public class Rectangle extends Shape {
	private int sideA;
	private int sideB;
	
	Rectangle(){super();}
	Rectangle(int a, int b){
		super(4);
		sideA= a;
		sideB= b;
	}
	public void setA(int a){sideA = a;}
	public void setB(int b){sideB = b;}
	public int getA(){return sideA;}
	public int getB(){return sideB;}
	
	public String toString(){
		return super.toString() + "This shape's sides are \n side a : "
	+ this.sideA + "\t side b : " + this.sideB;	
	}
	public boolean areEqual(Rectangle kati){
		return (this.sideA == kati.sideA) && (this.sideB==kati.sideB);
	}
	public boolean isSquare(){
		return this.sideA==this.sideB;
	}
	public void draw(){
		for (int i=0;i<this.sideA;i++){
			for(int k=0; k<this.sideB;k++){
				if (i==0 ||i==this.sideA-1){
				System.out.print("* ");
				}else{
					if(k==this.sideB-1 || k==0){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
	public Rectangle copy(){
		return new Rectangle(this.sideA, this.sideB);
	}
	public double area(){return this.sideA*this.sideB;}
	public double perimeter(){return 2*(this.sideA + this.sideB);}
	
	
	
}