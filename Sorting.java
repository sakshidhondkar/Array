
public class Sorting {

	 public void bubble(int a[], int n){
			  
	       int temp = 0;  
	        for(int i=0; i < n; i++){  
	        	for(int j=1; j<(n-i); j++){  
	                if(a[j-1] > a[j]){  
	                                 //swap elements  
	                     temp = a[j-1];  
	                     a[j-1] = a[j];  
	                     a[j] = temp;  
	                }  
	              
	        	}  
         }  
			
		

	}
	public void selection(int a[],int n)
	{
		for (int i = 0; i <n- 1; i++)  
        {  
            int index = i;  
            for (int j = i+1;j<n;j++){  
                if (a[j] < a[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber =a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
	}

}
}