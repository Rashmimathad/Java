package com.xworkz.amazonapp.ecommerce;

import com.xworkz.amazonapp.product.Product;

public interface EcommerceRules {

    boolean addProduct(Product product);
    boolean updatePriceByProductId(int productId,double updatedPrice);
    String getCategoryOfProductByProductId(int productId);
    Product getProductInfoById(int productId);
    void displayProductInfo(Product product);
    void getAllProductsDetails();
    boolean deleteProductById(int productId);

}
