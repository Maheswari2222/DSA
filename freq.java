import java.util.*;

public class freq {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter array size ");
    int n=Sc.nextInt();
    int arr[]= new int [n];
    System.out.println("Enter array elaments ");
    for(int i=0;i<n;i++)
    {
        arr[i]=Sc.nextInt();
    }  
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int num : arr)
    {
        hm.put(num,hm.getOrDefault(num,0)+1);
    }
    for(int key : hm.keySet())
    {
        System.out.println(key+" -> "+hm.get(key));
    }

    }
    
}
