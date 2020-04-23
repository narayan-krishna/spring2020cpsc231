/** Card.java
*
* This is a Card class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 5: Modern War(fare)
* @version 1.0
*/

public class Card{

  /**Value of the card*/
  private String value;
  /**Suit of the card*/
  private String suit;

  /**Default constructor - sets value and size to "X"*/
  public Card(){
    value = "X";
    suit = "X";
  }

  /**Overloaded constructor - creates card of given value and suit
  * @param value Value of the card
  * @param suit Suit of the card
	*/
  public Card(String value, String suit){
    this.value = value;
    this.suit = suit;
  }

  /**Sets the value of the card to value given
  * @param value Value to set card to
  */
  public void setValue(String value){
    this.value = value;
  }

  /**Returns the value of the card
  * @return A string representing the value of the card
  */
  public String getValue(){
    return value;
  }

  /**Sets the suit of the card to suit given
  * @param suit Suit to set card to
  */
  public void setSuit(String suit){
    this.suit = suit;
  }

  /**Returns the suit of the card
  * @return A string representing the suit of the card
  */
  public String getSuit(){
    return suit;
  }

  /**Returns the numerical worth of the card depending on value
  * @return An int representing the cards worth
  */
  public int getWorth(){
    if(value.equals("2")){
      return 2;
    }else if(value.equals("3")){
      return 3;
    }else if(value.equals("4")){
      return 4;
    }else if(value.equals("5")){
      return 5;
    }else if(value.equals("6")){
      return 6;
    }else if(value.equals("7")){
      return 7;
    }else if(value.equals("8")){
      return 8;
    }else if(value.equals("9")){
      return 9;
    }else if(value.equals("10")){
      return 10;
    }else if(value.equals("J")){
      return 11;
    }else if(value.equals("Q")){
      return 12;
    }else if(value.equals("K")){
      return 13;
    }else{
      return 14;
    }
  }

  /**Returns the value and suit as a string
  * @return A string representing the value and suit of the card
  */
  public String toString(){
    return value + suit;
  }
}
