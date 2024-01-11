package week1;
import java.util.Scanner;
public class SumofNumbers {
	public static void main(String args[]) {
		int num1,num2,num3,sum;
		Scanner Sc=new Scanner(System.in);
				System.out.println("Enter any three number");
				num1=Sc.nextInt();
				num2=Sc.nextInt();
				num3=Sc.nextInt();
				sum=num1+num2+num3;
				System.out.println("Sum of"+num1+","+num2+"and"+num3+" is:"+sum);
	}

}
