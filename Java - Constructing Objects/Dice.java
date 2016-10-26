class Dice{
	static int sum; //το sum αρχικοποιείται απο την java στο μηδεν
	public static void roll(){
        int dice1 = 0, dice2 =0;
		while((dice1!=1) || (dice2!=1)){
			sum += 1;
			dice1 = (int) (Math.random()*6 + 1 );
			dice2 = (int) (Math.random()*6 + 1 );
			System.out.println(dice1 + " "+ dice2);
	    }
	}

   public static void main(String[]args){
	 roll();
	 System.out.println("These are the times the dices roll:" + sum);
   }
}
