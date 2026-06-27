package Exercise_2;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ProductService ps=new ProductService();
        while(true){
            System.out.println(" 1. Add product \n 2. View products \n 3. Search product \n 4. Exit ");
            try{
                int choice=Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter the product name : ");
                        String Pname=sc.nextLine();
                        System.out.println("Enter the product category : ");
                        String PCategory=sc.nextLine();
                        ps.addProduct(Pname, PCategory);
                        break;
                    case 2:
                        ps.viewProducts();
                        break;
                    case 3:
                        System.out.println("1.Search by product Id \n2.Search by product Name");
                        int searchChoice=Integer.parseInt(sc.nextLine());
                        switch (searchChoice) {
                            case 1:
                                System.out.println("Enter the product Id to search : ");
                                int Id=Integer.parseInt(sc.nextLine());
                                ps.getProductById(Id);    //binary search
                                break;
                            case 2:
                                System.out.println("Enter the product Name to search : ");
                                String Name=sc.nextLine();
                                ps.getProductByName(Name);  //linear search
                                break;
                            default:
                                System.out.println("Enter the valid number");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Enter the numbers from the options");
                }
            }catch(NumberFormatException e){
                System.out.println("Enter only the number");
            }
        }
    }
}