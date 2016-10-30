
public class Arraies {

	public static void main(String[] args) {
		int[] array = {1, 3, 1, 2, 5, 6, 0, 8, 9, 0, 1, 13, 3, 1};
		int smallest = array[0];
		String position = "";
		for (int i=0; i<array.length; i++){
			if (array[i]<= smallest){
				smallest = array[i];
			}
		}
		for (int i=0; i<array.length; i++){
				if (array[i] == smallest){
					position = position + " " + i;
				}
		}
		System.out.println("To min einai to " + smallest + " stis theseis: " + position );

	}
}