import java.util.*;
class CompleteSubarrays
{
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
        int res = cntCompleteSubArray(arr,n);
        System.out.println("The count is :"+res);
       
    }
    public static int cntCompleteSubArray(int arr[],int n)
    {
        Set < Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        int dis = set.size();
        Map<Integer,Integer> hm = new HashMap<>();
        int cnt=0;
        int left=0;
        for(int right=0;right<n;right++)
        {
            hm.put(arr[right],hm.getOrDefault(arr[right],0)+1);
           // cnt+=(n-right);
            //decrese the freq of left element
            while(hm.size()== dis)
            {
            cnt+=(n-right);
            hm.put(arr[left],hm.get(arr[left])-1);
            //if left freq equals zero remove left
            if(hm.get(arr[left])==0)
            {
                hm.remove(arr[left]);
            }
            left++;
        }
        } 
        return cnt;
    }

}