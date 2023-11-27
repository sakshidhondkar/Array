import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max=20;
		int ch2;
		int a[]=new int[max];
		int a1[]=new int[max];
		Scanner sc=new Scanner(System.in);
		ArraOperation obj=new ArraOperation();
		System.out.println("Enter Number Of Element: ");
		int n=sc.nextInt();
		do
		{
			System.out.print("\n1. Create array\n2. Display Array\n3. Search\n4. Sort\n5. Set Opearation\n6. ");
			System.out.println("\nEnter Choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				obj.create(a,n);
				break;
			case 2:
				obj.display(a,n);
				break;
			case 3:
				System.out.print("Enter element to be search:");
				int key=sc.nextInt();
				obj.search(a,n,key);
				break;
			case 4:
				obj.sort(a,n);
				obj.display(a, n);
				break;
			case 5:
				System.out.println("Enter Number Of Element of second array: ");
				int n1=sc.nextInt();
				obj.create(a1, n1);
				obj.setOperation(a,a1,n,n1);
				break;
				//union
				//intersection
				//set1- set2
				//set2-set1
				
				
			}
			System.out.println("Do u Want to perform More More OPerations::If Yes press 1 : ");
			ch2=sc.nextInt();
			
		}while(ch2==1);
		
		
		
		
	}

}
