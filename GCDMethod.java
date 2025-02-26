// import java.util.Scanner;

// public class GCD {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int gcd = findGCD(a, b);
//         System.out.println("GCD: " + gcd);
//     }

//     public static int findGCD(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }
import java.util.Scanner;

public class GCDMethod {
    // Method to calculate GCD
    public static int findGCD(int num1, int num2) {
        int gcd = 1; // Initializing gcd to 1
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update gcd when a common factor is found
            }
        }
        return gcd; // Return the GCD value
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calling the method to find GCD
        int gcd = findGCD(num1, num2);

        // Displaying the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
        scanner.close();
    }
}