package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.constants.Availability;
import com.xworkz.amazonapp.product.Product;
import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println();

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no of products to be added :");
        Amazon amazon =new Amazon(sc.nextInt());

        System.out.println("Total number of products to be added are : "+amazon.products.length);
        for (int i = 0; i < amazon.products.length; i++) {
            Product product=new Product();
            System.out.println();
            System.out.println("Enter the product "+(i+1)+" details :");
            System.out.println();

            System.out.print("Enter the product Id : ");
            product.setProductId(sc.nextInt());

            System.out.print("Enter the product name : ");sc.nextLine();
            product.setProductName(sc.nextLine());

            System.out.print("Enter the category of product : ");
            product.setCategoryOfProduct(sc.nextLine());


            System.out.print("Enter the brand name of product : ");sc.nextLine();
            product.setBrandName(sc.nextLine());

            System.out.print("Enter the  price of product : ");
            product.setPrice(sc.nextDouble());

            System.out.print("Enter the manufacturer name of the product : ");sc.nextLine();
            product.setManufacturerName(sc.nextLine());

            System.out.print("Enter the product availability : ");
            product.setProductAvailability(Availability.valueOf(sc.next().toUpperCase()));

            amazon.addProduct(product);
            System.out.println("Number of products left to be added : "+(amazon.products.length-(i+1)));
        }

        System.out.println();
        amazon.getAllProductsDetails();

        System.out.print("Enter the product Id and update price for the product Id: ");
        System.out.println("Is Price Updated? "+amazon.updatePriceByProductId(sc.nextInt(),sc.nextDouble()));
        System.out.println();

        System.out.print("Enter the Product Id to get Product Info : ");
        amazon.displayProductInfo(amazon.getProductInfoById(sc.nextInt()));
        System.out.println();

        System.out.print("Enter the product Id to be deleted : ");
        amazon.deleteProductById(sc.nextInt());
//        Product productOne = new Product();
//        productOne.setProductId(101);
//        productOne.setProductName("Galaxy F34 5G");
//        productOne.setCategoryOfProduct("Electronics");
//        productOne.setBrandName("Samsung");
//        productOne.setPrice(19000.00);
//        productOne.setManufacturerName("Samsung private Ltd.");
//
//        Product productTwo = new Product();
//        productTwo.setProductId(102);
//        productTwo.setProductName("Boat Airdopes 200 Plus");
//        productTwo.setCategoryOfProduct("Electronics");
//        productTwo.setBrandName("Boat");
//        productTwo.setPrice(799.00);
//        productTwo.setManufacturerName("Boat private Ltd.");
//
//        Product productThree = new Product();
//        productThree.setProductId(103);
//        productThree.setProductName("Badmiton Racket");
//        productThree.setCategoryOfProduct("Sports Accessories");
//        productThree.setBrandName("Decathlon");
//        productThree.setPrice(900.00);
//        productThree.setManufacturerName("Decathlon private Ltd.");
//
//        Product productFour = new Product();
//        productFour.setProductId(104);
//        productFour.setProductName("Mysore Silk Saree");
//        productFour.setCategoryOfProduct("Women Ethnic Wear");
//        productFour.setBrandName("Mysore Silks");
//        productFour.setPrice(3500.00);
//        productFour.setManufacturerName("Mysore Silks");
//
//        Product productFive = new Product();
//        productFive.setProductId(105);
//        productFive.setProductName("Peter England Formal Shirts");
//        productFive.setCategoryOfProduct("Mens Formal Wear");
//        productFive.setBrandName("Peter England");
//        productFive.setPrice(2000.00);
//        productFive.setManufacturerName("Peter England");
//
//        Product productSix = new Product();
//        productSix.setProductId(106);
//        productSix.setProductName("Gold Plated Jhumkas");
//        productSix.setCategoryOfProduct("Women Ethnic Accessories");
//        productSix.setBrandName("Tira");
//        productSix.setPrice(299.00);
//        productSix.setManufacturerName("Tira Accesories");
//
//        Product productSeven = new Product();
//        productSeven.setProductId(107);
//        productSeven.setProductName("Mixer Grinder");
//        productSeven.setCategoryOfProduct("Electronics");
//        productSeven.setBrandName("Hawels");
//        productSeven.setPrice(5500.00);
//        productSeven.setManufacturerName("Hawels Private Ltd.");
//
//        Product productEight = new Product();
//        productEight.setProductId(108);
//        productEight.setProductName("Luxury Hammock Swing Chair");
//        productEight.setCategoryOfProduct("Furniture");
//        productEight.setBrandName("Jhula King");
//        productEight.setPrice(7493.00);
//        productEight.setManufacturerName("Furniture Kart");
//
//        Product productNine = new Product();
//        productNine.setProductId(109);
//        productNine.setProductName("arovemic Jenga Wooden Block");
//        productNine.setCategoryOfProduct("Board Games");
//        productNine.setBrandName("arovemic");
//        productNine.setPrice(299.00);
//        productNine.setManufacturerName("SR Enterprises");
//
//        Product productTen = new Product();
//        productTen.setProductId(110);
//        productTen.setProductName("Ikigai");
//        productTen.setCategoryOfProduct("Self help Books");
//        productTen.setBrandName("Penguin Random House");
//        productTen.setPrice(2000.00);
//        productTen.setManufacturerName("Penguin Random House India Private Limited");
//
//        Product productEleven = new Product();
//        productEleven.setProductId(111);
//        productEleven.setProductName("KADENCE Concert Ukulele");
//        productEleven.setCategoryOfProduct("Musical Instrument");
//        productEleven.setBrandName("KADENCE");
//        productEleven.setPrice(1743.00);
//        productEleven.setManufacturerName("NFM TRADING");
//
//        Product productTwelve = new Product();
//        productTwelve.setProductId(112);
//        productTwelve.setProductName("Cadbury Dairy Milk");
//        productTwelve.setCategoryOfProduct("Chocolates");
//        productTwelve.setBrandName("Cadbury");
//        productTwelve.setPrice(572.00);
//        productTwelve.setManufacturerName("Mondelez India Foods Pvt Ltd");
//
//        Product productThirteen = new Product();
//        productThirteen.setProductId(113);
//        productThirteen.setProductName("Motorbike Helmet");
//        productThirteen.setCategoryOfProduct("Bike Accessories");
//        productThirteen.setBrandName("FOROLY");
//        productThirteen.setPrice(900.00);
//        productThirteen.setManufacturerName("Foroly Enterprises");
//
//        Product productFourteen = new Product();
//        productFourteen.setProductId(114);
//        productFourteen.setProductName("Washing Machine");
//        productFourteen.setCategoryOfProduct("Electronics");
//        productFourteen.setBrandName("Bosch");
//        productFourteen.setPrice(34770.00);
//        productFourteen.setManufacturerName("BSH Pvt Ltd");
//
//        Product productFifteen = new Product();
//        productFifteen.setProductId(115);
//        productFifteen.setProductName("Shoes");
//        productFifteen.setCategoryOfProduct("Sports Shoes");
//        productFifteen.setBrandName("Puma");
//        productFifteen.setPrice(1599.00);
//        productFifteen.setManufacturerName("Puma");
//
//        Product productSixteen = new Product();
//        productSixteen.setProductId(116);
//        productSixteen.setProductName("Skin Cleanser");
//        productSixteen.setCategoryOfProduct("SkinCare");
//        productSixteen.setBrandName("Cetaphil");
//        productSixteen.setPrice(371.00);
//        productSixteen.setManufacturerName("Bubchen-Werk Ewald Hermes");
//
//        Product productSeventeen = new Product();
//        productSeventeen.setProductId(117);
//        productSeventeen.setProductName("Retro Game Console");
//        productSeventeen.setCategoryOfProduct("PS5");
//        productSeventeen.setBrandName("GAMESOUL");
//        productSeventeen.setPrice(5015.00);
//        productSeventeen.setManufacturerName("SHENZHEN TECHONOLOGIES");
//
//        Product productEighteen = new Product();
//        productEighteen.setProductId(118);
//        productEighteen.setProductName("Solo Microwave Oven");
//        productEighteen.setCategoryOfProduct("Kitchenware");
//        productEighteen.setBrandName("Panasonic");
//        productEighteen.setPrice(6440.00);
//        productEighteen.setManufacturerName("Panasonic");
//
//        Product productNineteen = new Product();
//        productNineteen.setProductId(119);
//        productNineteen.setProductName("Clock");
//        productNineteen.setCategoryOfProduct("Home Decor");
//        productNineteen.setBrandName("Ajanta");
//        productNineteen.setPrice(171.00);
//        productNineteen.setManufacturerName("orpat industrial");


//        System.out.println("Is Product One Added? "+amazon.addProduct(productOne));
//        System.out.println("Is Product Two Added? "+amazon.addProduct(productTwo));
//        System.out.println("Is Product Three Added? "+amazon.addProduct(productThree));
//        System.out.println("Is Product Four Added? "+amazon.addProduct(productFour));
//        System.out.println("Is Product Five Added? "+amazon.addProduct(productFive));
//        System.out.println("Is Product Six Added? "+amazon.addProduct(productSix));
//        System.out.println("Is Product Seven Added? "+amazon.addProduct(productSeven));
//        System.out.println("Is Product Eight Added? "+amazon.addProduct(productEight));
//        System.out.println("Is Product Nine Added? "+amazon.addProduct(productNine));
//        System.out.println("Is Product Ten Added? "+amazon.addProduct(productTen));
//        System.out.println("Is Product Eleven Added? "+amazon.addProduct(productEleven));
//        System.out.println("Is Product Twelve Added? "+amazon.addProduct(productTwelve));
//        System.out.println("Is Product Thirteem Added? "+amazon.addProduct(productThirteen));
//        System.out.println("Is Product Fourteen Added? "+amazon.addProduct(productFourteen));
//        System.out.println("Is Product Fifteen Added? "+amazon.addProduct(productFifteen));
//        System.out.println("Is Product Sixteen Added? "+amazon.addProduct(productSixteen));
//        System.out.println("Is Product Seventeen Added? "+amazon.addProduct(productSeventeen));
//        System.out.println("Is Product Eighteen Added? "+amazon.addProduct(productEighteen));
//        System.out.println("Is Product Nineteen Added? "+amazon.addProduct(productNineteen));


        System.out.println();
        System.out.println("main ended");
    }
}
