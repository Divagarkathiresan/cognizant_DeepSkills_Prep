package Exercise_1_Inventory_Management_System;
import java.util.*;

public class ProductService {

    public static LinkedHashMap<Integer,Product> products=new LinkedHashMap<>();

    public void addItem(String name,int q,int p){
        int id=ProductIdGenerator.GenerateProductId();
        Product product=new Product(name, q, p);
        products.put(id,product);
    }

}
