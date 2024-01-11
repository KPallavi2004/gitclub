package week1;
import java.util.Scanner;
public class FactorialOfNum {

	public static void main(String[] args) {
		int num,i;
		long factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find its factorial :");
		num=sc.nextInt();
		if(num>0)
		{
			for(i=1;i<=num;i++)
			{
				factorial=factorial*i;
			}
			System.out.println("The factorial of given number "+num+" is :"+factorial);
		}
		else if(num<0)
		{
			System.out.println("The Factorial for a Negative number is not defined.");
		}
		else
		{
			System.out.println("The Factorial of given number is 0");
		}
		
		// TODO Auto-generated method stub

	}
}

