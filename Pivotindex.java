import java.util.*;
class Pivotindex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements in array");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res = findPivotIndex(arr,n);
        System.out.println("The pivot index is "+res);
        sc.close();

    }
    public static int findPivotIndex(int arr[], int n)
    {
        int presum[] = new int[n];
        presum[0]=arr[0];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int ls=0;
        for(int i=0;i<n;i++)
        {
            if(ls==sum-ls-arr[i])
            {
                return i;
            }
            else
            {
                ls+=arr[i];
            }
            //return -1;
        }
        return -1;
    }
}