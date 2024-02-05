package gr.aueb.cf.ch15.products.service;
/**
 * This class sells products.
 * Composition and Forwarding.
 */

import gr.aueb.cf.ch15.products.model.IProduct;
import gr.aueb.cf.ch15.products.model.Milk;

public class Store {
    // Interface as composition.
    private IProduct product;

    //Dependency Injection - Invention of Control (IoC)
    // Main is doing the new product, not our constructor.
    //Dependency: store cannot work without product.

    public Store(IProduct product) {
        this.product = product;
    }

    public void purchase() {
        System.out.println("Milk sold");
        //product.insert();
    }
}
