/** PizzaDriver.java
*
* This is a PizzaDriver class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 4: More Classes
* @version 1.0
*/

public class PizzaDriver{
  /** The main method. Exercises the functionality of the Pizza and
  * the PizzaOrder class.
  * @param args The command line arguments  (not used)
  // */
  public static void main(String[]args){
    //make three pizzas, create an order for 2 pizzas, add the three pizzas to
    //the order, print out the order. 
    Pizza pizza1 = new Pizza('s', 1, 0, 1);
    Pizza pizza2 = new Pizza('m', 2, 2, 0);
    Pizza pizza3 = new Pizza('l', 2, 0, 0);
    PizzaOrder order = new PizzaOrder(2);
    System.out.println(order.addPizza(pizza1));
    System.out.println(order.addPizza(pizza2));
    System.out.println(order.addPizza(pizza3));
    System.out.println(order);
  }
}
