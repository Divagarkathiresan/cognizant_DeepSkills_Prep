package Exercise_1;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ProductService ps=new ProductService();
        while(true){
            System.out.println("1. add item");
            System.out.println("2. get all items");
            System.out.println("3. update item");
            System.out.println("4. Exit");
            int n=Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    System.out.println("Enter the product Name ");
                    String name=sc.nextLine();
                    System.out.println("Enter the product Quantity ");
                    int q=Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the product Price ");
                    int p=Integer.parseInt(sc.nextLine());
                    ps.addItem(name, q, p);
                    break;
                case 2:
                    LinkedHashMap<Integer,Product> hm=ps.getAllItems();
                    for(Map.Entry<Integer,Product> M:hm.entrySet()){
                        System.out.println(M.getKey());
                        Product prod=M.getValue();
                        System.out.println(prod.getProductName());
                        System.out.println(prod.getProductQuantity());
                        System.out.println(prod.getProductPrice());

                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Enter the valid number from 1 to 3");
            }
        }
    }
}