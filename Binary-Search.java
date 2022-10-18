import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int find = 3;
		int start=0, end=arr.length-1;
		int mid= (start+end)/2;
		
		while(start<=end)
		{
		    if(find==arr[mid])
		    {
		      System.out.println(mid);
		      break;
		    }
		    else if(find>arr[mid])
		    {
		        start=mid+1;
		    }
		    else
		    {
		      end=mid-1;  
		    }
		    mid=(start+end)/2;
		}
		
	}
}