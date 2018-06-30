package org.tact.base.rest;

public class Product {
	
	String name = "LED Monitor";
    double price = 2000000;
    int quantity = 10;
    
    void changeName(String newName) {
        name = newName;
    }
    
    void changePrice(double newPrice) {
        price = newPrice;
    }
    
    void changeQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    
    void printChanges() {
        System.out.println("Product: "+name+", Price: "+price+", Quantity: "+quantity);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
        Product product2 = new Product();
        
        // Invoke method on each objects
        product1.changeName("Keyboard");
        product1.changePrice(85000);
        product1.changeQuantity(100);
        product1.printChanges();
        
        product2.changeName("Mouse");
        product2.changePrice(55000);
        product2.changeQuantity(120);
        product2.printChanges();
	}

}
