import java.util.Scanner;

public class IT26102357Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
  
        int[] numbers = new int[6];
        
        System.out.println("Please enter 6 positive numbers:");
        
       
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int input = scanner.nextInt();
                
               
                if (input > 0) {
                    numbers[i] = input;
                    break; 
                } else {
                    System.out.println("Invalid input! Zero or negative numbers are not allowed. Try again.");
                }
            }
        }
        
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        
        System.out.println("\nSuccessfully stored 6 positive numbers in the array.");
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println("\nThe maximum number is: " + max);
        
       
        
    }
}