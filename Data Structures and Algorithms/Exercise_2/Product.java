package Exercise_2;

public class Product{
    private int productId;
    private String productName;
    private String productCategory;

    public Product(int productId, String productName, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

}