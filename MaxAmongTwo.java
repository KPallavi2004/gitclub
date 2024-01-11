package week1;
import java.util.Scanner;
public class MaxAmongTwo {
	public static void main(String[] args) {
		int num1,num2,max;
		Scanner Sc=new Scanner(System.in);
		num1=Sc.nextInt();
		num2=Sc.nextInt();
		max=(num1>num2)?num1:num2;
		System.out.println("Maximum number is : "+max);
		// TODO Auto-generated method stub

	}

}
