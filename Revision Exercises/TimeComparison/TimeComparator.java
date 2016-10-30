import java.util.Comparator;

public class TimeComparator implements Comparator<TimeCom>{

	@Override
	public int compare(TimeCom o1, TimeCom o2) {
		if (o1.getHour()==o2.getHour()){
			if(o1.getMin()==o2.getMin()){
				if (o1.getSec()==o2.getSec()){
					return 0;
				}else{
					return o1.getSec()-o2.getSec();
				}
			}else{
				return o1.getMin()-o2.getMin();
				
			}
		}else {
			return o1.getHour()-o2.getHour();
		}
	}
	public static void main(String args[]){
		TimeComparator kati = new TimeComparator();
		TimeCom ora1 = new TimeCom(5,20,55);
		TimeCom ora2 = new TimeCom(10,20,55);
		System.out.println(kati.compare(ora1,ora2));
	}
	

}
