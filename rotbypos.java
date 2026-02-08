import java.util.Scanner;

public class rotbypos {
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
    System.out.println("Enter the position");
    int k = Sc.nextInt();
    int temp[] = new int[n];
    for(int i=0;i<n;i++)
    {
        temp[(i+k)%n]=arr[i];
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(temp[i]+" ");
    }
    System.out.println();



        
    }
    
    
}
