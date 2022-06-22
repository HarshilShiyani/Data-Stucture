import java.util.*;
class prime{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for (int i=1;i<=n;i++) 
		{
			if(n%i==0)
			{
				flag++;
				break;
			}

			
		}
		if(flag==0)
		{
			System.out.print("prime");
		}
		else
		{
			System.out.print(" not prime");
		}

	}
}