import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        if (isPrime(num)) 
            System.out.println(num+" is a Prime number");  
        else
            System.out.println(num+" is not a prime number");
        

    }
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i = 2; i<=num/2; i++){
            if(num%i==0) return false;
        }
        return true;      
    
    }
}

// import java.util.Scanner;

// public class PrimeNumberInRange {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         // Taking user input for range
//         System.out.print("Enter the startin range: ");
//         int lower = scan.nextInt();

//         System.out.print("Enter the ending range: ");
//         int upper = scan.nextInt();

//         System.out.println("Prime numbers between " + lower + " and " + upper + " are:");

//         // Loop through the range and print prime numbers
//         for (int num = lower; num <= upper; num++) {
//             if (isPrime(num)) {
//                 System.out.print(num + " ");
//             }
//         }
//     }

//     // Method to check if a number is prime
//     public static boolean isPrime(int num) {
//         if (num <= 1) return false; // 0 and 1 are not prime

//         for (int i = 2; i < num; i++) { // Checking divisibility from 2 to num-1
//             if (num % i == 0) return false;
//         }
//         return true;
//     }
// }
