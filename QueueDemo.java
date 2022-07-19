import java.util.*;
class Queue{

	int rear=-1;
	int front=-1;
	int arr[]=new int[5];
	int i=0;
	void enqueue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter Value=");
		int val=sc.nextInt();
		if(rear>=4)
		{
			System.out.println("Queue overflow Value not inserted into Queue");
		}
		else
		{
			rear++;
			arr[rear]=val;
			rear++;
			i++;
		}
	}

	int dequeue()
	{
		if(rear==-1)
		{
			System.out.println("Queue is empty");
			return 0;
		}
		else
		{
			front++;
			return arr[front];
		}

	}
}
class QueueDemo{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Queue obj=new Queue();
		while(1>0)
		{	
			System.out.print("Enetr 1 And 2===");
			int op=sc.nextInt();

			if(op==1)
			{
				obj.enqueue();
			}
			else{
				int rtn=obj.dequeue();
				System.out.println(rtn);
			}
		}
	}
}