import java.util.*;


class product {
    int pcode;
    String pname;
    float price;
    public static void main(String args[])
    {
       
        Scanner scans = new Scanner(System.in);
        product obj1 = new product();
        product obj2 = new product();
        product obj3 = new product();
        System.out.println("Enter the details of first object");
        System.out.println("Enter the product code");
        obj1.pcode = scans.nextInt();
        scans.nextLine();
        System.out.println("Enter the product name");
        obj1.pname = scans.nextLine();
        
        System.out.println("Enter the price");
        obj1.price = scans.nextFloat();
        scans.nextLine();

    
        System.out.println("Enter the details of second object");
        System.out.println("Enter the product code");
        obj2.pcode = scans.nextInt();
        scans.nextLine();
        System.out.println("Enter the product name");
        obj2.pname = scans.nextLine();
        
        System.out.println("Enter the price");
        obj2.price = scans.nextFloat();
        scans.nextLine();


        System.out.println("Enter the details of first object");
        System.out.println("Enter the product code");
        obj3.pcode = scans.nextInt();
        scans.nextLine();
        System.out.println("Enter the product name");
        obj3.pname = scans.nextLine();
        
        System.out.println("Enter the price");
        obj3.price = scans.nextFloat();

        if(obj1.price < obj2.price && obj1.price < obj3.price)
        {
            System.out.println("Product having lowest price is ");
            System.out.println(obj1.pname);
            System.out.println(obj1.pcode);
            System.out.println(obj1.price);
        }
        else if(obj2.price < obj1.price && obj2.price < obj3.price)
        {
            System.out.println("Product having lowest price is ");
            System.out.println(obj2.pname);
            System.out.println(obj2.pcode);
            System.out.println(obj2.price);
        }
        else 
        {
            System.out.println("Product having lowest price is ");
            System.out.println(obj3.pname);
            System.out.println(obj3.pcode);
            System.out.println(obj3.price);
        }
    }
}
