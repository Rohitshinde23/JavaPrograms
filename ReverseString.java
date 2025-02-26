// import java.util.Scanner;

// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = scan.nextLine();

//         System.out.println("Reversed: " + reverseString(str));
//     }

//     public static String reverseString(String str) {
//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }
//         return rev;
//     }
// }


import java.util.Scanner;
public  class ReverseString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String : ");
            String str = sc.nextLine(); 
            System.out.println("Reversed String : "+reverseString(str));
        }
        public static String reverseString(String str){
            String rev = "";
            for(int i = str.length()-1; i>=0; i--){
                rev +=str.charAt(i);
            }
            return rev;
        }
}