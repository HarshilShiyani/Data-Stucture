import java.util.*;
class abc{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		Fact obj=new Fact();
		int answer=obj.factorial(n);
		System.out.print(answer);


	}
}
class Fact{

	public int factorial(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
}