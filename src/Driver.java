import java.util.Scanner;
public class Driver {
	

	
	public static void main(String[] args){
		//We need a scanner to read in the data
		Scanner ourScanner = new Scanner(System.in);
		//We will be reading in an integer into user Input later, for now it's default is -1;
		int userInput = -1;
		
		//prompt the user for the number
		System.out.println("Hello! Enter a number you want Reversed");
	
		//assign the user's input into the userInput variable
		userInput = ourScanner.nextInt();
		
		//Do this loop at least once, and repeat until userInput becomes 0
		do 
		{
			//This statemnent is used to isolate the variable furthest to the right of the current number
			System.out.print(userInput%10);
			//After the farthest right digit is printed, divide by 10 to cut it off
			userInput=userInput/10;
		} while (userInput>0);
		
		
		
	}
}
