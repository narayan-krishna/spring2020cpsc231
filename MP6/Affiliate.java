/** Affiliate.java
*
* This is an Affiliate class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public abstract class Affiliate implements Comparable<Affiliate>, Printable{

  /**Name of affiliate*/
  private String name;
  /**Age of affiliate*/
  private int age;
  /**Address of affiliate*/
  private String address;
  /**Phone number of affiliate*/
  private int phoneNumber;
  /**Year affiliate came to Chapman*/
  private int yearToChapman;

  /**Default constructor*/
  Affiliate(){
    this.name = "X";
    this.age = -1;
    this.address = "X";
    this.phoneNumber = -1;
    this.yearToChapman = -1;
  }

  /**Overloaded constructor
  * @param name Name of affiliate
  * @param age Age of affiliate
  * @param address Address of affiliate
  * @param phoneNumber Phone number of affiliate
  * @param yearToChapman Year affiliate came to Chapman
  */
  Affiliate(String name, int age, String address, int phoneNumber, int yearToChapman){
    this.name = name;
    this.age = age;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.yearToChapman = yearToChapman;
  }

  /**Returns name
  * @return A string representing the name
  */
  public String getName(){
    return name;
  }

  /**Sets the name to string given
  * @param name Name to set
  */
  public void setName(String name){
    this.name = name;
  }

  /**Returns age
  * @return An int representing the age
  */
  public int getAge(){
    return age;
  }

  /**Sets the age to number given
  * @param age Age to set
  */
  public void setAge(int age){
    this.age = age;
  }

  /**Returns address
  * @return A string representing the address
  */
  public String getAddress(){
    return address;
  }


  /**Sets the address to given string
  * @param address Address to set
  */
  public void setAddress(String address){
    this.address = address;
  }

  /**Returns phone number
  * @return An int representing the phone number
  */
  public int getPhoneNumber(){
    return phoneNumber;
  }

  /**Sets the phone number to number given
  * @param phoneNumber Phone number to set
  */
  public void setPhoneNumber(int phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  /**Returns year to Chapman
  * @return An int representing the year affiliate game to Chapman
  */
  public int getYearToChapman(){
    return  yearToChapman;
  }

  /**Sets the phone number to number given
  * @param yearToChapman Year to chapman to set
  */
  public void setYearToChapman(int yearToChapman){
    this.yearToChapman = yearToChapman;
  }

  /**Returns ID
  * @return An int representing ID
  */
  public int getID(){
    return -1;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "-1";
  }

  /**Returns an int depending on which of two affiliates is bigger
  * @return An int representing if one affiliates is bigger or another
  */
  public int compareTo(Affiliate c){
    if(this.yearToChapman >= c.yearToChapman){
      return 1;
    }else{
      return -1;
    }
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return name + ", " + age + ", " + address
    + ", " + phoneNumber + ", " + yearToChapman;
  }
}
