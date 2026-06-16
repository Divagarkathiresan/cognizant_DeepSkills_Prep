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

}
