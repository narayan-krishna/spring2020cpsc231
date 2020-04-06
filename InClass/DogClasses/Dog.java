/*
a. Elizabeth
b. 123124
c.
*/

public class Dog{
  //member variables - attributes of the class
  private String m_name;
  private String m_breed;
  private int m_age;
  private char m_gender;
  private static boolean m_goodDog = true; /*static variables are shared across all instances/objects of the class
                                            if you change for one, it changes for all
                                            non-instance specific */
  private static final String M_SPECIES = "canine"; //final - value can't be modified, usually used for constants

  //constructors - will create an instance/object of the class
  //default constructor - no args
  public Dog(){
    m_name = null;
    m_breed = null;
    m_age = -1;
    m_gender = 'F';
    m_goodDog = true;
  }

  //overloaded constructor - when creating the object, you know the information you want to pass
  public Dog(String name, String breed, int age, char gender){
    m_name = name;
    m_breed = breed;
    m_age = age;
    m_gender = gender;
  }

  //copy constructor
  public Dog(Dog d){
    m_name = d.m_name;
    m_breed = d.m_breed;
    m_age = d.m_age;
    m_gender = d.m_gender;
  }

  //accessors & mutators - for all member variables

  //accessor - accessing and returning a value
  public String getName(){
    return m_name;
  }

  //mutator - modify a value stored in a member variable
  public void setName(String name){
    m_name = name;
  }

  public int getAge(){
    return m_age;
  }

  public void setAge(int age){
    m_age = age;
  }

  public void setGoodDog(boolean goodDog){
    m_goodDog = goodDog;
  }

  public boolean getGoodDog(){
    return m_goodDog;
  }

  //other methods - actions for that object
  public void speak(){
    System.out.println("Bark!");
  }

  public int calcDogYears(){
    return m_age * 7;
  }

  public boolean equals(Dog d){ //d1.equals(d2)
    return (m_name.equals(d.m_name) && m_age == d.m_age && m_breed.equals(d.m_breed));
  }

  public String toString(){
    return("Name: " + m_name + "\nBreed: " + m_breed + "\nAge: " + m_age);
  }

/* DELETE ALL OF THIS OUT */
  //public static void main(String[] args) {
    // Dog d1 = new Dog(); //default
    // System.out.println(d1);
    // System.out.println();
    // Dog d2 = new Dog("Sydney", "Golden", 4, 'F');
    // System.out.println(d2);
    // System.out.println();
    // Dog d3 = new Dog("Chardonnay", "Aussie", 1, 'F');
    // System.out.println(d3);
    // System.out.println();
    // d3.setName("Mara");
    // d1 = d3; //object d1 is now pointing to the same place in memory d3 is, they pointing to the same object
    // System.out.println(d3);
    // System.out.println();
    // System.out.println(d1);
    // System.out.println(d1.getGoodDog());
    // d1.setGoodDog(false);
    // System.out.println(d3.getGoodDog()); /* since the variable is static, when we change it above,
                                          //it changes for all instances/objets*/

    // System.out.println(d3.calcDogYears());
    // System.out.println(d2.equals(d3));
  //}

}
