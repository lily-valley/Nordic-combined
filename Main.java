import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		
		Referee Anonymous=new Referee();
		Anonymous.calculation();
		Anonymous.printResults();
		
	}
	
	public static int amountT(){
		int teamAmount;
		System.out.println("Введите число команд");
		Scanner in = new Scanner(System.in); 
		 teamAmount = in.nextInt(); 
		 in.close();
		
		return teamAmount;
	}
	
	public static int amountC(){
		int compAmount;
		System.out.println("Введите число спортсменов в команде");
		Scanner in = new Scanner(System.in); 
		 compAmount = in.nextInt(); 
		 in.close();
		 
		return compAmount;
	}

}
