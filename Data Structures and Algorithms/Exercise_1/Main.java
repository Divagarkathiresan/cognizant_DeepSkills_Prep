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
                    if(hm.size() ==0 ) {System.out.println("No items in the inventory");}
                    else {
                        for(Map.Entry<Integer,Product> M:hm.entrySet()){
                        System.out.println("Product Id : "+M.getKey());
                        Product prod=M.getValue();
                        System.out.println("Product Name : "+prod.getProductName());
                        System.out.println("Product Quantity : "+prod.getProductQuantity());
                        System.out.println("Product Price : "+prod.getProductPrice());
                        System.out.println("-------------------------------------");
                        }
                    }
                    break;
                case 3:
                    
                    String updating_name="";
                    int updating_quantity=-1;
                    int updating_price=-1;

                    System.out.println("Enter the product id to be changed : ");
                    int Id=Integer.parseInt(sc.nextLine());

                    boolean nameFlag=false;
                    System.out.print("Do you want to change the product's name (yes/no): ");
                    String nameAccept = sc.nextLine();
                    if(nameAccept.equalsIgnoreCase("yes")){
                        nameFlag=true;
                    }
                    if(nameFlag){
                        System.out.print("Enter the updating name : ");
                        String nameToUpdate=sc.nextLine();
                        updating_name=nameToUpdate;
                    }

                    boolean quantityFlag=false;
                    System.out.print("Do you want to change the product's Quantity (yes/no): ");
                    String quantityAccept = sc.nextLine();
                    if(quantityAccept.equalsIgnoreCase("yes")){
                        quantityFlag=true;
                    }
                    if(quantityFlag){
                        System.out.print("Enter the updating quantity : ");
                        int quantityToUpdate=Integer.parseInt(sc.nextLine());
                        updating_quantity=quantityToUpdate;
                    }
                    boolean priceFlag=false;
                    System.out.print("Do you want to change the product's price (yes/no): ");
                    String priceAccept = sc.nextLine();
                    if(priceAccept.equalsIgnoreCase("yes")){
                        priceFlag=true;
                    }
                    if(priceFlag){
                        System.out.print("Enter the updating price : ");
                        int priceToUpdate=Integer.parseInt(sc.nextLine());
                        updating_price=priceToUpdate;
                    }
                    ps.updateItem(Id, updating_name, updating_quantity, updating_price);

                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Enter the valid number from 1 to 3");
            }
        }
    }
}