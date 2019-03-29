/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12_3;

/**
 *
 * @author Antonio
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declare and instantiate a Shirt object using an Item reference type
        Item item = new Shirt(56.69, 'M', 'G');

        // Test for non-Shirt object type
        //  Item item = new Item();
        // call the display method on the object, then the getColor method
        item.display();
        if (item instanceof Shirt) {
            String color = ((Shirt) item).getColor();
            System.out.println("Color: " + color);
        } else {
            System.out.println("Item is not a Shirt.");
        }
    }
}
