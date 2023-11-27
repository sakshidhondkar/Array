import java.util.Scanner;
public class ArraOperation {
	Scanner sc1=new Scanner(System.in);
	int ch3;
	public void create(int arr[], int n)
	{
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc1.nextInt();
		}
	}
	
	public void display(int arr[], int n)
	{
		System.out.println("------Display Array-------------------");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void search(int arr[],int n, int key)
	{
		Search S1 =new Search();
		do
		{
			System.out.print("\n1. Linear Search\n2. Binary Search");
			System.out.println("Enter Choice:");
			int ch1=sc1.nextInt();
			switch(ch1)
			{
			case 1:
				S1.linear(arr, n, key);
				break;
			case 2:
				S1.binary(arr,n,key);
				break;
				
			}
			System.out.println("Do u Want to Continue Searching::If Yes press 1 : ");
			ch3=sc1.nextInt();
		}while(ch3==1);
		
		
	}
	public void sort(int arr[],int n)
	{
		Sorting S2 =new Sorting();
		do
		{
			System.out.print("\n1. Linear Search\n2. Binary Search");
			System.out.println("Enter Choice:");
			int ch1=sc1.nextInt();
			switch(ch1)
			{
			case 1:
				S2.selection(arr, n);
				 
				break;
			case 2:
				S2.bubble(arr,n);
				 
				break;
				
			}
			System.out.println("Do u Want to Continue Sorting::If Yes press 1 : ");
			ch3=sc1.nextInt();
		}while(ch3==1);
	}
	public void setOperation(int arr1[],int arr2[],int n1, int n2)
	{
		SetOperation S3 =new SetOperation();
		do
		{
			System.out.print("\n1. Union\n2. Intersection\n3. Difference");
			System.out.println("Enter Choice:");
			int ch1=sc1.nextInt();
			switch(ch1)
			{
			case 1:
				S3.union(arr1,arr2,n1,n2);
				 
				break;
			case 2:
				 
				S3.intersection(arr1,arr2,n1,n2);
				break;
			case 3:
				S3.difference(arr1,arr2,n1,n2);
				break;
				
			}
			System.out.println("Do u Want to Continue Sorting::If Yes press 1 : ");
			ch3=sc1.nextInt();
		}while(ch3==1);
	}

}
