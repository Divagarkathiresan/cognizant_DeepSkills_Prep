package Exercise_1;

import java.util.*;

public class ProductService {

    public static LinkedHashMap<Integer,Product> products=new LinkedHashMap<>();

    public void addItem(String name,int q,int p){
        int id=ProductIdGenerator.GenerateProductId();
        Product product=new Product(name, q, p);
        products.put(id,product);
    }

    public LinkedHashMap<Integer,Product> getAllItems(){
        return products;
    }

    public void updateItem(int id,String name,int quantity,int price){
        boolean flag=false;
        for(Map.Entry<Integer,Product> M:products.entrySet()){
            if(M.getKey()==id){
                flag=true;
                Product product=M.getValue();
                if(name.length()>0) product.setProductName(name);
                if(quantity>-1) product.setProductQuantity(quantity);
                if(price>-1) product.setProductPrice(price);
            }
        }
        if(flag) System.out.println("Item Updated");
        else System.out.println("Id not found");
    }

}
