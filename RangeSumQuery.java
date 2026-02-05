import java.util.*;
public class RangeSumQuery {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System .out.println("Enter array size : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr [] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int presum[]= new int[n];
        presum[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            presum[i] = presum[i-1]+arr[i];
        }
        System.out.println("Enter no of test cases : ");
        int k = sc.nextInt();
        for(int i=0;i<k;i++)
        {
            System.out.println("Enter the range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int res = sumOfSubArrayRange(presum,l,r);
            System.out.println("The sum os subarray in range "+l+"and"+r+"is"+res);
        }
        
    }
    public static int sumOfSubArrayRange(int arr[], int l, int r)
    {
        
        if(l==0)
            return arr[r];
        else
            return arr[r]-arr[l-1];
    }
    
}
