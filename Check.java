class Check{

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		
		int x=fun(arr,5);
		System.out.print(x);
		
	}
	static int fun(int arr[],int m)
		{
			int i=0;
			if(i<arr.length)
			{
				if(arr[i]==m)
				{
					return 1;
				}
				else if(i==(arr.length-1))
				{
					return 0;
				}
				else
				{
					i++;
					return fun(arr,m);
				}
			}
			else
			{
				return 0;
			}
			
		}
}
