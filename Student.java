package Q1;

import java.util.Scanner;

public class Student {
	private String name;
	private char roomType;
	private double rate;
	Scanner input = new Scanner(System.in);
	
	public Student(){
		System.out.println("\n\tWelcome to Hostel Fee Calculation Program");
		System.out.println("\n\tRoom Type available : A, B, C");
		System.out.println("\t --------------------------------------- ");
		System.out.println("\t|   ROOM TYPE   |  RATE (per semester)  |");
		System.out.println("\t --------------------------------------- ");
		System.out.println("\t|\tA\t|\tRM 450.00 \t|");
		System.out.println("\t|\tB\t|\tRM 400.00 \t|");
		System.out.println("\t|\tC\t|\tRM 350.00 \t|");
		System.out.println("\t --------------------------------------- ");
		
		setDetails(name);
		setRoom(roomType);
		selectRoom();
	}
	
	public Student(String name, char roomType){
		this.name=name;
		this.roomType = roomType;
	}
	
	public void setDetails(String name) {
		System.out.print("Please enter your name   : ");
		name = input.nextLine();
		for (int i=0; i < name.length() ; i++)
	        { 
	            char ch = name.charAt(i);
	            if(Character.isSpace(name.charAt(0)) || Character.toString(ch).matches("\\p{Punct}") || Character.isDigit(ch)) {
	            	System.out.println("Invalid input. Please make sure your input contain letter only!\n");
	            	System.out.print("Please enter your name   : ");
	        		name = input.nextLine();
	            }	   
      	}    
		this.name = name;
	}
	
	public void setRoom(char roomType) {
		System.out.print("Please enter your choice : ");
		roomType = input.next().charAt(0);		
		roomType= Character.toUpperCase(roomType);
		while(roomType != 'A' && roomType != 'B' && roomType != 'C') {
			System.out.println("Invalid choice! Please enter again!\n");
			System.out.print("Please enter your choice : ");
			roomType = input.next().charAt(0);	
			roomType= Character.toUpperCase(roomType);
		}
		this.roomType = roomType;		
	}
	

	public void selectRoom() {
		if (roomType == 'A'){
			rate = 450;
		}
		
		else if (roomType == 'B') {
			rate = 400;
		}
		
		else if (roomType == 'C') {
			rate = 350;
		}
	}
	
	public void displayDetails()
	{
		System.out.println("\nBelow is the report hostel fee:");
		System.out.println("Student Name  \t\t : " + name.toUpperCase());
		System.out.println("Room Type   \t\t : " + roomType);
		System.out.printf("Room Rate per semester \t : RM %.2f \n", rate);
		System.out.printf("Room Rate for one year (two semester) : RM %.2f \n", (rate*2));
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.displayDetails();
		
		Student s2 = new Student("Sophie", 'A');
		s2.selectRoom();
		s2.displayDetails();	
	}
}
