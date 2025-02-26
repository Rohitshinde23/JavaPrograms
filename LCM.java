import java.util.Scanner;  // Import Scanner class for user input

public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create Scanner object
        System.out.print("Enter first number: ");
        int a = scan.nextInt();  // Read first number from user
        System.out.print("Enter second number: ");
        int b = scan.nextInt();  // Read second number from user

        int lcm = (a * b) / findGCD(a, b);  // Formula to calculate LCM
        System.out.println("LCM: " + lcm);  // Print LCM
    }

    public static int findGCD(int a, int b) {  // Function to find GCD using the Euclidean Algorithm
        while (b != 0) {  // Continue until remainder becomes 0
            int temp = b;  
            b = a % b;  // Update 'b' with remainder
            a = temp;  // Assign 'b' to 'a'
        }
        return a;  // Return GCD
    }  
}

// import java.util.Scanner;

// public class LCMMethod {
//     // Method to calculate GCD (Helper method for LCM)
//     public static int findGCD(int num1, int num2) {
//         int gcd = 1;
//         for (int i = 1; i <= num1 && i <= num2; i++) {
//             if (num1 % i == 0 && num2 % i == 0) {
//                 gcd = i;
//             }
//         }
//         return gcd;
//     }

//     // Method to calculate LCM using GCD
//     public static int findLCM(int num1, int num2) {
//         return (num1 * num2) / findGCD(num1, num2); // LCM formula
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Taking input from the user
//         System.out.print("Enter first number: ");
//         int num1 = scanner.nextInt();
        
//         System.out.print("Enter second number: ");
//         int num2 = scanner.nextInt();
        
//         // Calling the method to find LCM
//         int lcm = findLCM(num1, num2);

//         // Displaying the result
//         System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
//         scanner.close();
//     }
// }