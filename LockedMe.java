package phase1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMe {
	
	private static String currDirectory = "F:\sherley\\";
	private static Scanner scanner = new Scanner( System.in );

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("******************************\n");
		System.out.println("-----------LockedMe-----------\n");
		System.out.println("******************************\n");
		System.out.println("Developer Details:");
		System.out.println("Created by: Sherley");
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
				displayAllFiles();
				break;
			case 2:
				mainInterface();
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
	
	private static void displayAllFiles(){
        File directoryPath = new File(currDirectory);
        String contents[] = directoryPath.list();
        System.out.println();
        System.out.println("LIST OF FILES:\n");
        Arrays.sort(contents, Collator.getInstance());
        if(contents.length!=0){
            for(int i=0; i<contents.length; i++) {

                System.out.println("\t"+(i+1)+"-"+contents[i]);
            }

        }
        else {
                System.out.println("The Directory is empty!");
        }
	}
	 
	 private static void mainInterface() {
		 int choice = 0;
		 while(choice!=4) {
		 System.out.println("\n-------------MENU-------------\n");
			System.out.println("1.Add A New File");
			System.out.println("2.Delete A File");
			System.out.println("3.Search For A File");
			System.out.println("4.Go Back To Main Menu");
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
				// Skip the newline
				scanner.nextLine();
				addFile();
				break;
			case 2:
				// Skip the newline
				scanner.nextLine();
				deleteFile();
				break;
			case 3:
				// Skip the newline
				scanner.nextLine();
				searchFile();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid input.\n");
				break;
			}
		 }
	 }
	 
	 private static void addFile() {
		 while(true) {
			 String fileName;
			 System.out.println("\nEnter the name for the file: ");
			 fileName = scanner.nextLine();
			 File newFile = new File(currDirectory + "/" + fileName);
			 String filePath = currDirectory + "/" + fileName;
			 if(newFile.exists()) {
				 System.out.println("\nFile name already exists, please try a different name.\n");
			 } else {
				 try {
		               	String str;
		               	System.out.println("\nEnter the contents of the file: ");
		               	str= scanner.nextLine();
		                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		                writer.write(str);
		                writer.close();
				} catch (IOException e) {
					System.out.println("\nSystem encountered an error, please try again.\n");
					continue;
				}
				 System.out.println("\nFile created successfully!\n");
				 break;
			 }
		 }
		 
	 }
	 
	 private static void deleteFile() {
		 
		System.out.println("\nEnter the name of the file to be deleted: ");
		String fileName = scanner.nextLine();
		int check = 0;
		File dir = new File(currDirectory);
		String[] files = dir.list();
		for(String file : files) {
			if(file.equals(fileName)) {
	        	File fileToBeDeleted = new File(currDirectory + "/" + fileName);
	        	if(fileToBeDeleted.delete())
	        	{
	        		check = 1;
					System.out.println("\nFile was deleted successfully!");
					System.out.println("\nThe deleted file: " + fileToBeDeleted.getName());
				}
	        }
		}

		if(check==0) {
			System.out.println("\nNo such file exists.");
		}

	 }
	 
	 private static void searchFile() {
		
		 System.out.println("\nEnter the file name to be searched: ");
		 int check = 0;
		 String fileName = scanner.nextLine();
		 File directory = new File(currDirectory);
		 File[] searchedFiles = directory.listFiles((thisFileDirectory, thisFileName) -> thisFileName.startsWith(fileName));
		 if(searchedFiles.length != 0)
		 {
			 for(File currFile: searchedFiles) {
				 if(currFile.getName().equals(fileName)) {
					 check = 1;
					 System.out.println("\nFile was found!\n");
					 System.out.println("File Name: " + currFile.getName());
					 System.out.println("\nFile Content:");
					 FileReader fr;
					 try {
						fr = new FileReader(currFile.getAbsolutePath());
						BufferedReader br = new BufferedReader(fr);
						String line;
						while((line = br.readLine()) != null){
						    System.out.println(line);
						}
					 } catch (IOException e) {
						 System.out.println("\nSystem encountered an error, please try again.\n");
					}
				 }
			 }
		 }
		 if(check==0) {
			System.out.println("\nNo file exists with that name.");
		 }
	 }
}
