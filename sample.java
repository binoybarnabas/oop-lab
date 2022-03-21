import java.util.*;
class sample
{
    public static void main(String args[])
    {
        System.out.print("enter the name");
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.print("enter the rollno");
        int roll = obj.nextInt();
        System.out.print("enter the marks");
        float marks = obj.nextFloat();
        
        System.out.println("*** entered details are ***");
        System.out.println("Name is " + name);
        System.out.println("roll no. is " + roll);
        System.out.println("mark is " + marks);


    }
}  