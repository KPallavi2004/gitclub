package week1;
import java.util.Scanner;
public class MaxAmongThree {
	public static void main(String[] args) {
		int num1,num2,num3,max;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter any three numbers:");
		num1=Sc.nextInt();
		num2=Sc.nextInt();
		num3=Sc.nextInt();
	max=(num1>num2)?((num1>num3)? num1:num3):((num2>num3)?num2:num3);
				System.out.println("Maximum number is : " + max);
		// TODO Auto-generated method stub

	}

}
