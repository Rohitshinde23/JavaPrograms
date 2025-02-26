import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Sum Of Digit is : "+sumofdigit(num));
    }
    public static int sumofdigit(int num){
        int sum = 0;
        while (num>0) {
            sum+=num%10;
            num/=10;
           }
           return sum;
        }
}
