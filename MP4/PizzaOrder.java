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

  /**The default constructor - sets the number of pizzas to 1, creates a new
  * small pizza with one cheese topping. Sets order to new pizza array of
  * size 1, puts pizza into array.
	*/
  public PizzaOrder(){
    numPizzas = 1;
    Pizza pizzaDefault = new Pizza('s', 1, 0, 0);
    order = new Pizza[numPizzas];
    order[0] = pizzaDefault;
  }

  /**The overloaded constructor - creates a new pizza order of given number
  * of pizzas.
  * @param numPizzas int representing the number of pizzas
	*/
  public PizzaOrder(int numPizzas){
    this.numPizzas = numPizzas;
    order = new Pizza[this.numPizzas];
  }

  /** Adds a pizza to the order. If the addition is successful, returns 1,
  * If the addition is not successful (order is full), returns -1.
  * @param pizza Pizza to add to order
  * @return An integer representing whether the addition was or wasn't
  * successful.
  */
  public int addPizza (Pizza pizza){
    //if the pizza order is full (last pizza isn't null), return -1
    if(order[numPizzas-1] != null){
      return -1;
    }else{
      //add pizza to the earliest empty spot in the array.
      for(int i = 0; i < numPizzas; ++i){
        if(order[i] == null){
          order[i] = pizza;
          break;
        }
      }
      return 1;
    }
  }

  /**
  * Returns the total cost of the order.
  * @return A double representing the total cost of the order
  */
  public double calcTotal(){
    double totalCost = 0;
    //if the pizza spot in the order is empty, continue to loop
    for(int i = 0; i < numPizzas; ++i){
      if(order[i] == null){
        continue;
      //add the calculated cost of the current pizza to the total cost
      }else{
        totalCost += order[i].calcCost();
      }
    }
    return totalCost;
  }

  /** Returns a pretty-printed string representation of the pizza order.
  * @return A string representation of the PizzaOrder object.
  */
  public String toString(){
    String orderString = "Total cost: " + calcTotal() + "\n";
    for(int i = 0; i < numPizzas; ++i){
      if(order[i] == null){
        continue;
      }else{
        orderString += "\nPIZZA " + (i+ 1) + ":\n" + order[i];
      }
    }
    return orderString;
  }
}
