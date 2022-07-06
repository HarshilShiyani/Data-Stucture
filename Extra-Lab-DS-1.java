
class Hms{
	public static void main(String[] args) {
		
		int n=10000;
		int hour=0;
		int minute=0;
		int second=0;
		while(2>1)
		{
			if(n>=3600)
			{
				n=n-3600;
				hour++;
			}
			else if(n>=60)
			{
				n=n-60;
				minute++;
			}
			else
			{
				second=n;
				break;
			}
		}
		System.out.print(hour+":"+minute+":"+second);
	}

}
