import java.util.*;
class prime{
	public static boolean isprime(int n) {
		if(n < 2)
			return false;
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		if(isprime(n))
			System.out.println("prime");
		else 
			System.out.println("not prime");

	}
}
