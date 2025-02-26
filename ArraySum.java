import java.util.Scanner;
class ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers of elements in a array : ");
		int n= sc.nextInt();
		int [] number = new int[n];
		int sum = 0;
		System.out.println("Enter "+n+" Numbers");
		for(int i = 0; i<n; i++){
			number[i] = sc.nextInt();
			sum+= number[i];
		}
		 System.out.println("Sum of the array: " + sum);

        sc.close();
	}
}