package Exercise_1_Inventory_Management_System;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ProductService ps=new ProductService();
        System.out.print("1. add item || 2. get items || 3. update item");
        int n=Integer.parseInt(sc.nextLine());
        if(n==1){
            System.out.println("Enter the product Name ");
            String name=sc.nextLine();
            System.out.println("Enter the product Quantity ");
            int q=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the product Price ");
            int p=Integer.parseInt(sc.nextLine());
            ps.addItem(name, q, p);
        }
        sc.close();
    }
}