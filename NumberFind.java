package week1;
import java.util.Scanner;
public class NumberFind {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("The given number "+num+"is positive number.");
		}
		else if(num<0)
		{
			System.out.println("The given number "+num+"is negative number.");
		}
		else
		{
			System.out.println("The given number is a zero.");
		}
		// TODO Auto-generated method stub

	}

}
