import java.util.Arrays;
public class ArrayShift{

    public static void change(int [] matrix){
		int [] b = new int[10]; 
		for (int i=0; i<10; i++){
			for(int k=1; k<10;k++){
				int last = matrix[9];
				b[k]=matrix[k-1];
				b[0]= last;
			}
			for(int j=0;j<10;j++){
				matrix[j]= b[j];
			}
			System.out.println(Arrays.toString(matrix));
		}
	}
    public static void main(String[] args){
    	int [] pinax = {1,2,3,4,5,6,7,8,9,10};
		change(pinax);
    }
 }