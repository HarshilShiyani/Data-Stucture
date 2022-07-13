import java.util.*;
class Extra_Lab_3{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n=");
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		int j=0;


		for ( i=1,j=1;i<=n;i++)
		{
			for (j=1;j<=i;j++)
			{
				sum+=j;
			}
		}
		System.out.println("Sum="+sum);

	}
}