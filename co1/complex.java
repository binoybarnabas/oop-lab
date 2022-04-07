import java.util.Scanner;
public class complex {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the first comples number in a+ij form");
        String num1 = obj.nextLine();
        obj.nextLine();
        System.out.println("enter the second comples number in a+ij form");
        String num2 = obj.nextLine();
        int a1 = Integer.parseInt((num1.split("\\+")[0]));
        int a2 = Integer.parseInt((num1.split("\\+")[1]).split("i")[1]);
        int b1 = Integer.parseInt((num2.split("\\+")[0]));
        int b2 = Integer.parseInt((num2.split("\\+")[1]).split("i")[1]);
        System.out.println("sum = " + (a1+b1) +"+ i" + (a2+b2));

    }
}
