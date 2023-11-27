
public class Search {
	public void linear(int a[],int n, int key)
	{
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(key==a[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element Found !");
		}
		else
			System.out.println("Element not Found !");
	}
	public void binary(int a[], int n, int key)
	{
		int first=a[0];
		int last=a[n-1];
		int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( a[mid] < key ){  
		        first = mid + 1;     
		      }else if ( a[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element not found!");  
		   }  
         
               
	}

}
