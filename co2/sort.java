import java.util.Scanner;
public class sort {
    public static void main(String args[]){
        String temp;
        Scanner obj = new Scanner(System.in);
        String[] names = new String[10]; 
        //String[] out = new String[10];
        System.out.println("Enter the number of strings:");
        int size = obj.nextInt();
        System.out.println("enter the strings:");
        for(int i = 0;i<size;++i)
        {
            obj.nextLine();
            names[i] = obj.nextLine();
        }
        for(int i=0;i<size;++i)
        {
            System.out.println(names[i]);
        }
        for(int i = 0;i<size;++i)
        {
            for(int j=0;j<size;++j)
            {
                System.out.println(i +" " +j);
                if(names[i].compareTo(names[j]) < 0)
                {   
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    //System.out.println(temp + " " + names[j] + " " );
                }
            }
        }
        System.out.println("Sorted string are:");
        for(int i=0;i<size;++i)
        {
            System.out.println(names[i]);
        }
    }
}
