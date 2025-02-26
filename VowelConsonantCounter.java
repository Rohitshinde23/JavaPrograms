import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}


// import java.util.Scanner;

// public class VowelConsonantCounter {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Taking input from user
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();
        
//         // Converting the input to lowercase to simplify checking
//         input = input.toLowerCase();

//         int vowelCount = 0, consonantCount = 0;

//         // Looping through each character
//         for (int i = 0; i < input.length(); i++) {
//             char ch = input.charAt(i);

//             // Check if the character is a letter
//             if (ch >= 'a' && ch <= 'z') {
//                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                     vowelCount++;
//                 } else {
//                     consonantCount++;
//                 }
//             }
//         }

//         // Display the results
//         System.out.println("Number of vowels: " + vowelCount);
//         System.out.println("Number of consonants: " + consonantCount);

//         scanner.close();
//     }
// }