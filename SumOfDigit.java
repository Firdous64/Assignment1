import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		while(n>0) {
			int a=n%10;
			sum=sum + a;
			n=n/10;
			
		}
		System.out.println("sum of digit:"+sum);
	}

}
