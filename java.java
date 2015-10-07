import java.util.Scanner;


public class Java {

    public static void main(String[] args) {

		int count;
		int number;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number 1-100?");
		number = in.nextInt();
         
        for(count = 0; count <= number; count++){
                                 
			System.out.print(count+",");
			
		}

    }
}