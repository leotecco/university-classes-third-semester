import java.util.Scanner;

public class TestScanner {
		public static void main(String args[]) {
			System.out.printf("ENTER A NUMBER: ");

			Scanner s = new Scanner(System.in);
			
			int num = s.nextInt();
			
			System.out.printf("NUMBER ENTERED: %d\n", num);
		}
}
