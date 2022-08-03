import java.util.*;
class Stack{

	static int top=-1;
	int val;
	int arr[]=new int[10];
	Scanner sc=new Scanner(System.in);
	public void push()
	{
		System.out.print("Enter value You want to enter in Stack=");
		val=sc.nextInt();

		if(top>=arr.length-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;

			arr[top]=val;

		}
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return -100;
		}
		else
		{
			top--;
			return arr[top+1];
		}
	}	

}
class PushPop{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Stack obj=new Stack();

		while(1==1)
		{
			System.out.print("Enter 1 for push && 2 for pop=");
			int op=sc.nextInt();
			if(op==1)
			{
				obj.push();
			}
			else if(op==2)
			{
				int topmostvalue=obj.pop();
				System.out.println("top value is ="+topmostvalue);
			}
			else
			{
				System.out.print("Enter Only 1 or 2.!");
			}	

		}
		
		

	}
}
