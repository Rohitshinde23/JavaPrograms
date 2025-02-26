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

// import java.util.Scanner;

// public class PascalTriangle {

//     // Method to print Pascal's Triangle in a proper triangle shape
//     public static void printPascalTriangle(int rows) {
//         for (int i = 0; i < rows; i++) {
            
//             // Print leading spaces for alignment
//             for (int space = 0; space < rows - i; space++) {
//                 System.out.print("  ");
//             }

//             int num = 1; // First number in each row is always 1

//             for (int j = 0; j <= i; j++) {
//                 System.out.print(num + "   "); // Print number with extra space
                
//                 // Update `num` for the next column
//                 num = num * (i - j) / (j + 1);
//             }

//             System.out.println(); // Move to the next row
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get user input for number of rows
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();

//         // Call the method to print Pascal's Triangle
//         printPascalTriangle(rows);

//         scanner.close();
//     }
// }
