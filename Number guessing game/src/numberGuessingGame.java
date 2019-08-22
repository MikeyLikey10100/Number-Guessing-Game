import java.util.Scanner;
//test
public class numberGuessingGame
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
			
					{
			
			
					}
				int randomNumber = (int) (Math.random() *20 + 1);
		

			{
					{		
				Scanner userImput = new Scanner(System.in);
				System.out.println("Guess a number between 1 and 15");
				
			int guess = userImput.nextInt(); 
			boolean stillGuessing;
			
			while(stillGuessing)
				{
		if ( guess < randomNumber )
			{
				System.out.println("your number is too low");
				
			}
				
			
		
		else if (guess > randomNumber)
			{
				
				System.out.println("Your number is too high");
				
			}
					
				}
					
			else {
			System.out.println("your correct. please play again");
	
		
		}
					}
					
			
					}
			
			
	
	}
	}
				
				
				
				
				
			

	
