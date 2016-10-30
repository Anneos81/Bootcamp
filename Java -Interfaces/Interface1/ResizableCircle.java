package Interface1;
public class ResizableCircle extends Circle implements Resizable {
	public void resize(double percent){
		super.radius = super.radius*percent;
	}
	public void getParameter(){}
	public void getArea(){}

}
