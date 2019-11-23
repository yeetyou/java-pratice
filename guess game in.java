import java.util.Scanner;

public class Main{
    static int theNumber;
  public static void main (String[]args){
    
    theNumber = (int) (Math.random () * 100 + 1);

    System.out.println (theNumber);
    game();
    
  }
  
  
  static void game(){
      Scanner scan = new Scanner (System.in);
      int guess = 0;
    while (guess != theNumber) {
    	System.out.println ("Guess a number between 1 and 100 ");
    	try{
    	guess = scan.nextInt();
    	}catch(Exception e){
    	    System.out.println ("Please only enter numbers.");
    	    game();
    	}
    	if (guess < theNumber){
    	    System.out.println(guess + "is too low. Try again.");
    	}
    	else if(guess > theNumber ){
    	    System.out.println (guess + "is too high. Try again.");
    	}
    	else
    	    System.out.println(guess + " is correct. you win!");
    }
  }
  
}
