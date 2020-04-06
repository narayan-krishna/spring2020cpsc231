/** PizzaOrder.java
*
* This is a PizzaOrder class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 4: More Classes
* @version 1.0
*/

public class PizzaOrder{

  /**Array order of pizzas*/
  private Pizza[] m_order;
  /**Number of pizzas in order*/
  private int m_numPizzas;

  public PizzaOrder(){
    Pizza pizzaDefault = new Pizza('s', 1, 0, 0);
    m_numPizzas = 1;
    this.m_order = new Pizza[m_numPizzas];
  }

  public String toString(){
    
  }

  /** The main method. Exercises the Pizza class functionality.
  * @param args The command line arguments  (not used)
  // */
  public static void main(String[]args){
    PizzaOrder order = new PizzaOrder();
    System.out.println(m_order[0].toString());
  }
}
