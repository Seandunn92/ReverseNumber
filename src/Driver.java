import java.util.Scanner;
public class Driver {
	

	
	public static void main(String[] args){
		Scanner ourScanner = new Scanner(System.in);
		int userInput = -1;
		int ourDivisor =10;
		System.out.println("hi");
		System.out.println("Enter a number");
	
		userInput = ourScanner.nextInt();
		do 
		{
			System.out.print(userInput%10);
			userInput=userInput/10;
		} while (userInput>0);
		
		
		
	}
}
