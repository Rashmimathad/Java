public class Ecommerce {
    String applicationName;
    Category category;

    Ecommerce(){

    }

    Ecommerce(String applicationName,Category category){
        this.applicationName=applicationName;
        this.category=category;

    }

    public void getEcommerceDetails(){
        System.out.println("Ecommerce details fetched...");
        System.out.println("Application name is : "+applicationName);
        System.out.println();
        System.out.println("Category Details :");
        category.getCategoryDetails();
    }
}
