import java.util.Scanner;

public class Student 
{
	private String studentName;
	private char roomType;
	private double roomRate;
	
	public Student()
	{
		System.out.println("Welcome to Hostel Fee Calculation Program!");
		System.out.println("Room Type available : A, B, C");
		/*
		System.out.println(" --------------------------------------- ");
		System.out.println("|   Room Type   |  Rate (per semester)  |");
		System.out.println(" --------------------------------------- ");
		System.out.println("|\tA\t|\tRM 450.00 \t|");
		System.out.println("|\tB\t|\tRM 400.00 \t|");
		System.out.println("|\tC\t|\tRM 350.00 \t|");
		System.out.println(" --------------------------------------- ");
		*/
		setDetails(studentName);
		setRoom(roomType);
		selectRoom();
	}
	
	public Student(String studentName, char roomType)
	{
		this.studentName = studentName;
		this.roomType = roomType;
	}
	
	public void setDetails(String studentName)
	{
		System.out.print("\nPlease enter student name\t: ");
		Scanner scan = new Scanner(System.in);
		studentName = scan.nextLine();
		this.studentName = studentName;
	}
	
	public void setRoom(char roomType)
	{
		System.out.print("Please enter room type (A/B/C)  : ");
		Scanner scan = new Scanner(System.in);
		roomType = scan.next().charAt(0);
		this.roomType = Character.toUpperCase(roomType);
	}
	
	public void selectRoom()
	{
		switch(roomType)
		{
			case 'A': 
				roomRate = 450.00;
				break;
			
			case 'B':
				roomRate = 400.00;
				break;
				
			case 'C':
				roomRate = 350.00;
				break;
				
			default:
				System.out.println("Invalid room type!");
				break;
		}
	}
	
	public void displayDetails()
	{
		System.out.println("\nHere are the details.");
		System.out.println("Student Name  \t\t : " + studentName.toUpperCase());
		System.out.println("Room Type   \t\t : " + roomType);
		System.out.println("Room Rate (per semester) : RM " + roomRate);
		System.out.println("Room Rate (for one year) : RM " + (roomRate*2));
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
