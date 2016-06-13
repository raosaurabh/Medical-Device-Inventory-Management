/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Enterprise.ProductItem;

public class OrderItem {

    private ProductItem productItem;

    public ProductItem getProductItem() {
        return productItem;
    }

    public void setProductItem(ProductItem productItem) {
        this.productItem = productItem;
    }

    @Override
    public String toString() {
        return String.valueOf(productItem.getSerialNumber());
    }

}
