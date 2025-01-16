package idk;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the pyramid:");
		int size = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the symbol for the bricks of the pyramid:");
		String symbol = input.next();
		
		/*for (int i = 0; i <= (size - 1); i++) {
			System.out.println();
			for(int k = 0; k <(size -i -1); k++) {
				System.out.print("_");
				for(int k = 0; k < (i*2)+1; k++) {
					System.out.print("#");
				}
			}
		}*/
		
		for(int i = 0; i <= size-1; i++) {
			for(int j = 0; j<=(size -1 -i); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<(i*2)+1; k++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		

	}
}

