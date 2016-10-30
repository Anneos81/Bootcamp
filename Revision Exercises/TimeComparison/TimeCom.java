
public class TimeCom {
	private int hour;
	private int minute;
	private int second;

	TimeCom() {
	}

	TimeCom(int hour, int min, int sec) {
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}

	public void setHour(int hour) {
		if (hour>=0 && hour<=23){
			this.hour = hour;
		}else{
			this.hour = 0;
		}
	}

	public void setMin(int min) {
		if (min>=0 && min<=59){
			this.minute = min;
		}else{
			this.minute = 0;
		}
	}
	public void setSec(int sec) {
		if (sec>=0 && sec<=59){
			this.second = sec;
		}else {
			this.second = 0;
		}
	}
	public int getHour() {return this.hour;}
	public int getMin() {return this.minute;}
	public int getSec() {return this.second;}

	public String toString() {
		return "At the next tone the hour will be: \n" + this.hour + ":" + this.minute + ":" + this.second;
	}
	public void setTime(int h, int m, int s){
		this.setHour(h);
		this.setMin(m);
		this.setSec(s);
	}
	
	
	
	
	
}
