import java.util.Scanner;

public class arraysearch {
    void search(int num,int size,int arr[])
    {

        for(int i=0;i<size;++i)
        {
            if(arr[i] == num)
            {
                i++;
                System.out.println("Element found at the position "+ i);
                break;
            }
        }
    }
    public static void main(String args[])
    {
        int[] arr = new int[20];
        arraysearch ob = new arraysearch();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = obj.nextInt();
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;++i)
        {
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int num = obj.nextInt();
        ob.search(num,size,arr);
    }

}
