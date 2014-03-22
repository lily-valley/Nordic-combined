public class Team {
	private int compAmount;  // число участников в команде
	Competitor[] participants; //создали массив участников
	
	public Team(){
		compAmount = Main.amountC();
		int i;
		for (i = 0; i < compAmount; i++){
			participants[i] = new Competitor();
		}
	}
	
	public double go(){
		int i;
		double result = 0;
		for (i = 0; i < compAmount; i++){
			result+=participants[i].go();
		}
		return result;
	}
}
