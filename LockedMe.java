import java.util.Scanner;

public class LockedMe {
	
	private static Scanner scanner = new Scanner( System.in );

	public static void main(String[] args) {
		FileOperations fileOps = new FileOperations();
		int choice = 0;
		System.out.println("******************************\n");
		System.out.println("-----------LockedMe-----------\n");
		System.out.println("******************************\n");
		System.out.println("Developer Details:");
		System.out.println("Created by: XYZ");
		System.out.println("Created on: 30.06.2020\n");
		while(choice != 3) {
			System.out.println("\n-------------MENU-------------\n");
			System.out.println("1.View All The Files");
			System.out.println("2.Show File Management Options");
			System.out.println("3.Exit App");
			System.out.println("Enter your choice: ");
			try {
			choice = scanner.nextInt();
			}catch(Exception e) 
				{
					choice = 0;
					System.out.println("Invalid input.\n");
					scanner.nextLine();
				}
			switch(choice) {
			case 1: 
				fileOps.displayAllFiles();
				break;
			case 2:
				fileOps.mainInterface();
				break;
			case 3:
				System.out.println("\nThank you !!!");
				break;
			default:
				System.out.println("Invalid input.\n");
				break;
			}
		}
	}
}
