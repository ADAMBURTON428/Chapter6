package excercises;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) 
	{
		int userChoice;
		Scanner input = new Scanner(System.in);
		
		do 
		{
			System.out.print("pick a number >>> ");
			userChoice = input.nextInt();
			if (userChoice % 2== 0)
			{
				System.out.print("Good Job ");
				
			}
			else 
				System.out.print("Error ");
			
		}while (userChoice != 999);

	}

}
