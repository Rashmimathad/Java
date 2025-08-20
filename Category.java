public class Category {
    int categoryId;
    String categoryName;
    Product product;

    Category(){

    }

    Category(int categoryId,String categoryName,Product product){
        this.categoryId=categoryId;
        this.categoryName=categoryName;
        this.product=product;
    }

    public void getCategoryDetails(){
        System.out.println("Category details fetched...");
        System.out.println("Category ID is : "+categoryId);
        System.out.println("Category name is : "+categoryName);
        System.out.println();
        System.out.println("Product Details : ");
        this.product.getProductDetails();
    }

}
