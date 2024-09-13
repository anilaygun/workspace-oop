package org.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("X Kahve Makinesi");
        product1.setUnitPrice(12850);
        product1.setDiscount(2000);
        product1.setUnitsInStock(50);
        product1.setImageUrl("");

        // System.out.println(product1.name);


        Product product2 = new Product();
        product2.setName("Y Kahve Makinesi");
        product2.setUnitPrice(12850);
        product2.setDiscount(2000);
        product2.setUnitsInStock(50);
        product2.setImageUrl("");


        Product product3 = new Product();
        product3.setName("Z Kahve Makinesi");
        product3.setUnitPrice(12850);
        product3.setDiscount(2000);
        product3.setUnitsInStock(50);
        product3.setImageUrl("");

        Product[] products = {product1, product2, product3};
        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("15");
        individualCustomer.setPhoneNumber("5555555555");
        individualCustomer.setFirstName("Anıl");
        individualCustomer.setLastName("Aygün");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Etiya");
        corporateCustomer.setPhoneNumber("5551111111");
        corporateCustomer.setTaxNumber("0000000000");
        corporateCustomer.setCustomerNumber("11");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}