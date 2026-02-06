import java.util.Scanner;

public class MaxAvgSubArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in an array : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter k :");
        int k = sc.nextInt();
        double res = maxavgSubArray(arr,k,n);
        System.out.println("The count is :"+res);
    }
    public static double maxavgSubArray(int arr[],int k,int n)
    {
        int sum=0;
        int maxsum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        for(int i=k;i<n;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];
            maxsum = Math.max(sum,maxsum);


        }
        return (double)maxsum/k;

    }
    
}
