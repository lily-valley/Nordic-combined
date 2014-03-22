public class Competitor{
	private int skiJump;   // очки в прыжке с трамплина
	private int marathon;  // время марафона в секундах
	
	public double go(){
		skiJump = (int)(10*Math.random() + 1);
		marathon = (int)(10*Math.random() + 1);
		double result = 4*skiJump + marathon;
		return result;
	}
}
