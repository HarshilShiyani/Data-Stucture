import java.util.Stack;
class Bst{

	Node root;
	class Node{
		Node left;
		Node right;
		int data;

	 Node(int data){
	 	this.data=data;
	 	this.left=null;
	 	this.right=null;

	 }
	}

	void insert(int d){
	Node newnode=new Node(d);
	if(root==null){
		root=newnode;
	}
	else
	{
	Node temp=root;
		
	while(root.left!=null||root.right!=null){
		if(newnode.data>=temp.data&&temp.right!=null)
		{
			temp=temp.right;
		}
		else if(newnode.data<temp.data&&temp.left!=null)
		{
			temp=temp.left;
		}
		else
		{
			break;
		}
	}
		if(newnode.data>=temp.data){

			temp.right=newnode;
		}
		else{

			temp.left=newnode;
		}

		}
	}
	void display_inorder()
	{	
		Stack<Node> stk=new Stack<Node>();
		
		Node temp=root;

			while(temp!=null||stk.size()>0)
			{
				while(temp!=null)
				{
					stk.push(temp);					
					temp=temp.left;

				} 
					temp=stk.pop();
					System.out.println(temp.data);
					temp=temp.right;
				
			}
	}
	void display_preorder(){
		if(root==null)
		{
			System.out.print("null--");
		}
		else
		{
			Stack<Node> stk1=new Stack<Node>();
			Node demo=root;
			stk1.push(demo);
			while(stk1.size()>0)
			{
				demo=stk1.pop();
				System.out.println(demo.data);
			
			if(demo.right!=null)
			{
				stk1.push(demo.right);
			}
			else if(demo.left!=null)
			{
				stk1.push(demo.left);
			}

		}
	}
	}

}
class BstDemo
{

	public static void main(String[] args) {

		Bst obj=new Bst();
		obj.insert(9);
		obj.insert(15);
		obj.insert(18);
		obj.insert(1);
		obj.insert(104);
		obj.insert(166);
		obj.display_inorder();
		System.out.println("===========");
		obj.display_preorder();
		
	}
}