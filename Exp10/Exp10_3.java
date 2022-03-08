import java.util.*;
class quicksort
{
    public static void main(String[] args)
    {
        quicksort q = new quicksort();
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number of element in the array : ");
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    System.out.print("Enter the array elements : \n");
	    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
	    q.qsort(a,0,n-1);
	    q.print(a,n);
        sc.close();
    }
    void qsort(int a[], int low, int high )
    { 
	    int x;
	    if(low<high)
	    {
		    x = partition(a,low,high);
		    qsort(a,low,x-1);
		    qsort(a,x+1,high);
	    }
    }
    int partition(int a[],int low, int high)
    {
	    int pivot = a[high];
	    int i=low-1;
	    for(int j=low;j<high;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
			    int temp = a[i];
			    a[i]=a[j];
			    a[j]=temp;
			}
    	}
	    int temp = a[i+1];
	    a[i+1]=a[high];
	    a[high]=temp;
	    return i+1;
    }
    void print(int a[], int n)
    {
	    System.out.print("The Sorted Array is ");
	    for(int i=0;i<n;i++)
		    System.out.format("%d ",a[i]);
	    System.out.println();
    }
}