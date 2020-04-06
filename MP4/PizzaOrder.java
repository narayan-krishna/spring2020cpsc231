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

  /**Number of pizzas in order*/
  private int numPizzas;
  /**Array order of pizzas*/
  private Pizza[] order;

  public PizzaOrder(){
    numPizzas = 1;
    Pizza pizzaDefault = new Pizza('s', 1, 0, 0);
    order = new Pizza[numPizzas];
    order[0] = pizzaDefault;
  }

  public PizzaOrder(int numPizzas){
    this.numPizzas = numPizzas;
    order = new Pizza[this.numPizzas];
  }

  public int addPizza (Pizza pizza){
    if(order[numPizzas-1] != null){
      return -1;
    }else{
      for(int i = 0; i < numPizzas; ++i){
        if(order[i] == null){
          order[i] = pizza;
          break;
        }
      }
      return 1;
    }
  }

  public double calcTotal(){
    double totalCost = 0;
    for(int i = 0; i < numPizzas; ++i){
      if(order[i] == null){
        continue;
      }else{
        totalCost += order[i].calcCost();
      }
    }
    return totalCost;
  }

  public String toString(){
    String orderString = "Total cost: " + calcTotal() + "\n";
    for(int i = 0; i < numPizzas; ++i){
      if(order[i] == null){
        continue;
      }else{
        orderString += "\nPIZZA " + (i+ 1) + ":\n" + order[i].toString();
      }
    }
    return orderString;
  }

  /** The main method. Exercises the Pizza class functionality.
  * @param args The command line arguments  (not used)
  // */
  public static void main(String[]args){
    PizzaOrder order = new PizzaOrder(2);
    Pizza p1 = new Pizza('s', 1, 0, 0);
    Pizza p2 = new Pizza('s', 1, 0, 0);
    Pizza p3 = new Pizza('s', 1, 0, 0);
    System.out.println(order.addPizza(p1));
    System.out.println(order.addPizza(p2));
    System.out.println(order.addPizza(p3));
    System.out.println(order.toString());
  }
}
