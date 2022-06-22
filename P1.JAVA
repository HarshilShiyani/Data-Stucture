import java.utit.*;
class factorial{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n=sc.nextLine();
		int sum=1;
		for (int i=1;i<=n;i++) 
		{
			sum=sum*i;
		}
		System.out.print("Answer="+sum);

	}
}