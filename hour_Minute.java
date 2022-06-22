import java.util.*;
class main{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter hour");
		int hour=sc.nextInt();
		System.out.print("Enter Minute");
		int minute=sc.nextInt();
		int minute1=minute/5;
		int ang1=hour-minute1;
		if(ang1<0)
		{
		    ang1=ang1*(-1);
		}
		double minang=minute*0.5;
		double hourang=(minute1-hour)*30;
		if(hourang<0)
		{
		    hourang=hourang*(-1);
		}
		double finalangle=hourang+minang;
		System.out.print("Final "+finalangle);
		

	}
}