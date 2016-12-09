package sum_3_5;
import java.util.Scanner;


public class Sum35 {
	
	public static void main (String [] args){
		int sum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer");
		int myint = keyboard.nextInt();

	    for (int i = 0; i < myint; i++) {
	        if (i % 3 == 0 || i % 5 == 0) {
	            sum = sum + i;
	        }            
	    }

	    System.out.println(sum);
	}
	
}
