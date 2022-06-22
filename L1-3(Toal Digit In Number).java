import java.utit.*;
class {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number");
		int n=sc.nextLine();
		int tot_number=1;
		for (int i=1;n>=10;i++) 
		{
			n=n/10;
			tot_number++;


		}
		System.out.print("Answer="+tot_number);

	}
}
