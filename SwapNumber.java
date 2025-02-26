//swap two number without using third variable

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number : ");
        int num2 = sc.nextInt();
        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After swaping: num1 = " + num1 + ", num2 = " + num2);
    
    }
}