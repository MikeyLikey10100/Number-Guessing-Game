import java.util.Scanner;

public class numberGuessingGame
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
		
				int randomNumber = (int) (Math.random() *20 + 1);
		

		
				Scanner userImput = new Scanner(System.in);
				System.out.println("Guess a number between 1 and 20");
				
				

			
			boolean stillGuessing = true;
			
			while(stillGuessing)
				{
					int guess = userImput.nextInt(); 
					if ( guess < randomNumber )
					{
				System.out.println("your number is too low");
				
					}
				
					if (guess > randomNumber)
					{
				
				System.out.println("Your number is too high");
				
					}
					

					
					if (guess == randomNumber)
					{
						System.out.println("your correct. Thanks for playing");
						stillGuessing = false;
					}
		
				}	
					
			}
	}
				
				
				
				
				
			

	
