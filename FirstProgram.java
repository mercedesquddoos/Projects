import java.util.Scanner;
import test.Simple;

public class FirstProgram {
	static int age = 21;
	
	public static void main( String[] args){
		String name = "Susan";
		String theirName;
		int totalAge;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		theirName = keyboard.next();	
		
		totalAge = Simple.add(age, 10);
		
		System.out.println("Hello " + theirName);
		System.out.println("My name is " + name );
		
		System.out.println("My age plus 10 is " + totalAge);
	}
}