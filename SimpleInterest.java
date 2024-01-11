package week1;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int principle,time,rateOfInterest;
		float SimpleInterest;
		System.out.println("Enter p,t,r,values:");
		principle=Sc.nextInt();
		time=Sc.nextInt();
		rateOfInterest=Sc.nextInt();
		SimpleInterest=(principle*time*rateOfInterest)/100;
		System.out.println("SimpleInterest:"+SimpleInterest);
		
		
		// TODO Auto-generated method stub

	}

}
