import java.util.*;
class abc{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter n");
	int n=sc.nextInt();
		Digitsum obj=new Digitsum();
		obj.digsum(n);
		int x=obj.sum;
		System.out.print("Total Digitsum"+x);
	}

}
class Digitsum{

	int sum=0;
	public int digsum(int n)
	{
		if(n<10)
		{
			sum=sum+n;
			return 0;
		}
		else
		{
			sum=sum+n%10;
			return digsum(n/10);
		}
		
	}
}
