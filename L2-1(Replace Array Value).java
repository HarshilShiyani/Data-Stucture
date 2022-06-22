import java.util.*;
class main{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) 
		{
			System.out.print("Enter value of"+i+"=");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter n1");
		int n1=sc.nextInt();
		System.out.print("Enter n2");
		int n2=sc.nextInt();
		for (int i=0;i<n;i++) 
		{
			if(arr[i]==n1)
			{
				arr[i]=n2;
				System.out.println("Updated Index"+i);
			}

		}

	}
}
