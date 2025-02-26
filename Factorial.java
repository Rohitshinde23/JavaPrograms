import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Factorial of : "+num+ " is - "+ factorial(num));
    }
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact *=i;
        }
        return fact;
    }

}
