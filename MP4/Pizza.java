/** Pizza.java
*
* This is a Pizza class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 4: More Classes
* @version 1.0
*/

public class Pizza{

  private char size;
  private int cheeseToppings;
  private int pepperoniToppings;
  private int veggieToppings;

  /**The default constructor - sets the size to 'X', cheese toppings, pepperoni
   *toppings, veggie toppings to -1.
	 */
  public Pizza(){
    size = 'X';
    cheeseToppings = -1;
    pepperoniToppings = -1;
    veggieToppings = -1;
  }

  /**The overloaded constructor - creates a pizza of given size, and number of
  * cheese, pepperoni, and veggie toppings.
  * @param size char representing size
  * @param cheeseToppings int representing number of cheese toppings
  * @param pepperoniToppings int representing number of pepperoni toppings
  * @param veggieToppings int representing number of veggie toppings
  */
  public Pizza(char size, int cheeseToppings, int pepperoniToppings,
  int veggieToppings){
      this.size = Character.toUpperCase(size);
      this.cheeseToppings = cheeseToppings;
      this.pepperoniToppings = pepperoniToppings;
      this.veggieToppings = veggieToppings;
  }

  /**The copy constructor - creates a pizza by copying another pizza
  * @param p pizza object representing pizza to copy from
  */
  public Pizza(Pizza p){
    size = p.size;
    cheeseToppings = p.cheeseToppings;
    pepperoniToppings = p.pepperoniToppings;
    veggieToppings = p.veggieToppings;
  }

  /** Sets the size of the pizza.
  * @param size The size of the pizza
  */
  public void setSize(char size){
    this.size = Character.toUpperCase(size);
  }

  /** Returns the size of the pizza.
  * @return A char representing the size of the pizza
  */
  public char getSize(){
    return size;
  }

  /** Sets the number of cheese toppings.
  * @param cheeseToppings The number of cheese toppings
  */
  public void setCheeseToppings(int cheeseToppings){
    this.cheeseToppings = cheeseToppings;
  }

  /** Returns the number of cheese toppings.
  * @return An int representing the number of cheese toppings
  */
  public int getCheeseToppings(){
    return cheeseToppings;
  }

  /** Sets the number of pepperoni toppings.
  * @param pepperoniToppings The number of pepperoni toppings
  */
  public void setPepperoniToppings(int pepperoniToppings){
    this.pepperoniToppings = pepperoniToppings;
  }

  /** Returns the number of pepperoni toppings.
  * @return An int representing the number of pepperoni toppings
  */
  public int getPepperoniToppings(){
    return pepperoniToppings;
  }

  /** Sets the number of veggie toppings.
  * @param veggieToppings The number of veggie toppings
  */
  public void setVeggieToppings(int veggieToppings){
    this.veggieToppings = veggieToppings;
  }

  /** Returns the number of veggie toppings.
  * @return An int representing the number of veggie toppings
  */
  public int getVeggieToppings(){
    return veggieToppings;
  }

  /** Returns the cost of the pizza given size and number of toppings.
  * @return A double representing the cost of the pizza
  */
  public double calcCost(){
    double toppingsCost = 2.0*(cheeseToppings+pepperoniToppings+veggieToppings);
    if(size == 'S'){
      return 10 + toppingsCost;
    }else if(size == 'M'){
      return 12 + toppingsCost;
    }else if(size == 'L'){
      return 14 + toppingsCost;
    }else{
      System.out.println("invalid pizza size, cost cannot be calculated");
      return -1;
    }
  }

  /** Returns a pretty-printed string representation of the student record.
  * @return A string representation of the Pizza object.
  */
  public String toString(){
    return "Size: " + size + "\nCheese Toppings: " + cheeseToppings
    + "\nPepperoni Toppings: " + pepperoniToppings + "\nVeggie Points: "
    + veggieToppings + "\nCost: " + calcCost();
  }

  /** The main method. Exercises the Pizza class functionality.
  * @param args The command line arguments (not used)
  */
  public static void main(String[]args){
    Pizza pie = new Pizza();
    pie.setSize('l');
    pie.setCheeseToppings(1);
    pie.setPepperoniToppings(1);
    pie.setVeggieToppings(2);
    System.out.println(pie.getSize());
    System.out.println(pie.getCheeseToppings());
    System.out.println(pie.getPepperoniToppings());
    System.out.println(pie.getVeggieToppings());
    System.out.println(pie.calcCost());
    System.out.println(pie.toString());
  }

}
