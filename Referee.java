public class Referee {
	private int teamAmount; //число команд
	private double[] result;
	
	public void calculation(){
		
		teamAmount = Main.amountT();
		result=new double[teamAmount];
		Team[] teams = new Team[teamAmount];
		
		int i;
		for (i = 0; i < teamAmount; i++){
			teams[i] = new Team();
			result[i] = teams[i].go();
		}	
	
	}
	
	public void printResults(){
		int j;
		String s;
		for (j=0; j<teamAmount; j++){
			s=String.format("No %d result=%lld", j+1,result[j]);
			System.out.println(s);
		}
	}
}
