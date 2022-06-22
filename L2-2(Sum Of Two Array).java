import java.util.*;
class main{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int arr1[][]=new int[2][2];
		for (int i=0;i<2;i++) 
		{
			for (int j=0;j<2;j++) 
			{
				System.out.print("Enter value of"+i+"-"+j+"=");
				arr1[i][j]=sc.nextInt();
			}
		}
		int arr2[][]=new int[2][2];
		for (int i=0;i<2;i++) 
		{
			for (int j=0;j<2;j++) 
			{
				System.out.print("Enter value of"+i+"-"+j+"=");
				arr2[i][j]=sc.nextInt();
			}
		}
		int arr3[][]=new int[2][2];
		for (int i=0;i<2;i++) 
		{
			for (int j=0;j<2;j++) 
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.println("Addition"+i+"-"+j+"="+arr3[i][j]);
			}
		}

	}
}
