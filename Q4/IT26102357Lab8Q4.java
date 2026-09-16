import java.util.Scanner;

public class IT26102357Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
	   
        int[] studentsArray = new int[8];
        
        System.out.println("Enter Student IDs for 8 students (must be positive numbers):");
        
       
        for (int i = 0; i < studentsArray.length; i++) {
            while (true) {
                System.out.print("Enter Student ID " + (i + 1) + ": ");
                int id = scanner.nextInt();
                
               
                if (id > 0) {
                    studentsArray[i] = id;
                    break; 
                } else {
                    System.out.println("Invalid input! Student ID must be a positive number. Try again.");
                }
            }
        }
        
       
        System.out.print("\nEnter the Student ID you want to search for: ");
        int searchId = scanner.nextInt();
        
       
        boolean isAvailable = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
                isAvailable = true;
                break;
            }
        }
        

        if (isAvailable) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
        
       
        
    }
}