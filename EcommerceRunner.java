public class EcommerceRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Product product=new Product(11,"Galaxy F34",19000.00);
        Category category=new Category(111,"Electronics",product);
        Ecommerce ecommerce=new Ecommerce("FlipKart",category);
        ecommerce.getEcommerceDetails();
        System.out.println("main ended");
    }
}
