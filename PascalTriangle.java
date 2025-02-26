import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
            int num = 1; // First element is always 1
            
            // Print spaces for alignment
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); // Calculate next value using formula
            }
            
            System.out.println(); // Move to the next line
        }
        sc.close();
    }
}
