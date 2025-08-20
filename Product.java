public class Product {
    int productId;
    String productName;
    double productPrice;

    Product(){

    }

    Product(int productId,String productName,double productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }

    public void getProductDetails(){
        System.out.println("Product details fetched...");
        System.out.println("Product Id is : "+productId);
        System.out.println("Product name is : "+productName);
        System.out.println("Product Price is : "+productPrice);
    }
}
