import java.util.*;
class Extra_Lab_2{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Total Days=");
		int total_days=sc.nextInt();
		int year=0;
		int week=0;
		int days=0;

		while(1==1)
		{
			if(total_days>=365)
			{
				total_days-=365;
				year++;
			} 
			else if(total_days>=7)
			{
				total_days-=7;
				week++;
			}
			else
			{
				days=total_days;
				break;
			}
		}
		System.out.println(year+" "+"year"+" "+week+" "+"week"+" "+days+" "+"days");
		

	}
}