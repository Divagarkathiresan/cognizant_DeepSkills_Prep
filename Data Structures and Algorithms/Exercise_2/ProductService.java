package Exercise_2;
import java.util.*;
public class ProductService{
    private int count=1;
    private ArrayList<Product> products=new ArrayList<>();

    public void addProduct(String name,String category){
        int product_Id = count++;
        Product product=new Product(product_Id,name,category);
        products.add(product);
        System.out.println("Product added successfully.");
    }

    public void viewProducts(){
        if(products.size()>=1){
            for(Product product:products){
                System.out.println("Product Id : "+product.getProductId());
                System.out.println("Product Name : "+product.getProductName());
                System.out.println("Product Category : "+product.getProductCategory());
                System.out.println("---------------------");
            }
        }else{
            System.out.println("There is not products in the inventory");
            return;
        }
    }

    public void getProductByName(String name){
        boolean flag=false;
        for(Product product:products){
            if(product.getProductName().equalsIgnoreCase(name)){
                System.out.println("Product found");
                flag=true;
                System.out.println("Product Id : "+product.getProductId());
                System.out.println("Product Name : "+product.getProductName());
                System.out.println("Product Category : "+product.getProductCategory());
                System.out.println("---------------------");
            }
        }
        if(!flag) System.out.println("Product with product name : "+name+" not found");
    }

    public void getProductById(int id){
        boolean flag=false;
        int l=0;
        int r=products.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(products.get(mid).getProductId() == id){
                flag=true;
                System.out.println("Product found");
                System.out.println("Product Id : "+products.get(mid).getProductId());
                System.out.println("Product Name : "+products.get(mid).getProductName());
                System.out.println("Product Category : "+products.get(mid).getProductCategory());
                System.out.println("---------------------");
                break;

            }else if(mid > id){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(!flag) System.out.println("Product not found");
    }
}