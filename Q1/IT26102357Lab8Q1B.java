import java.util.Scanner;

public class IT26102357Lab8Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int[] myArray = new int[5];
        

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
        
       
        int evenCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenCount++;
            }
        }
        
        
        int[] evenArray = new int[evenCount];
        int j = 0;
        
        
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }
        
       
        System.out.println("\nEven numbers found and stored in evenArray:");
        if (evenCount == 0) {
            System.out.println("No even numbers were entered.");
        } else {
            for (int i = 0; i < evenArray.length; i++) {
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        }
        
        
        scanner.close();
    }
}