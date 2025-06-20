package dataStructures;
import java.util.Scanner;

public class Forecast {
	public static double futurefore(double curr_val,double growth, int years) {
		if(years==0)
		{
			return curr_val;
		}
		//formula:future(n)=future(n-1)*(1+growth)
		return futurefore(curr_val,growth,years-1)*(1+growth);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double currentval=sc.nextDouble();
		double growthrate=sc.nextDouble();
		int years=sc.nextInt();
		double result=futurefore(currentval,growthrate,years);
		System.out.println("Future forecast is:"+result);
	}

}
