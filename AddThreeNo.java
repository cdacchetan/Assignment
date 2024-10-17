import java.util.Scanner;

public class AddThreeNo
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a<b && b<c)
			System.out.println("The sum of smallest and largest number is : "+(a+c));
		if(b<a && a<c)
			System.out.println("The sum of smallest and largest number is : "+(b+c));
		if(a<c && c<b)
			System.out.println("The sum of smallest and largest number is : "+(a+b));
		if(a==b & b==c)
			System.out.println("The sum of smallest and largest number is : "+(a+b));
		if(a==b & b<c)
			System.out.println("The sum of smallest and largest number is : "+(a+c));
		if(a<b & b==c)
			System.out.println("The sum of smallest and the largest number is : "+(a+b));
		if(a<0 && b<0 && c<0)
			System.out.println("Invalid Input");
		sc.close();

	}
}
