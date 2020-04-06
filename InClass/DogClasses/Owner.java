public class Owner{
  private String m_name;
  private int m_age;
  private Dog m_dog;

  public Owner(){
    m_name = null;
    m_age = 0;
    m_dog = null;
  }

  public Owner(String name, int age, Dog d){
    m_name = name;
    m_age = age;
    m_dog = d;
  }

  // copy constructor
  // public Owner(Owner o){
  //   m_name = o.m_name;
  //   m_age = o.m_age;
  //   m_dog = o.m_dog; //shallow copy - reference to the same object
  // }

  public Owner(Owner o){
    m_name = o.m_name;
    m_age = o.m_age;
    m_dog = new Dog(o.m_dog); //deep copy - creates a new object (separate reference) that is the same in content
  }

  public void setName(String name){
    m_name = name;
  }

  public void setAge(int age){
    m_age = age;
  }

  public void setDog(Dog d){
    m_dog = d;
  }

  public String getName(){
    return m_name;
  }

  public int getAge(){
    return m_age;
  }

  public Dog getDog(){
    return m_dog;
  }

  public void changeDogName(String name){
    m_dog.setName(name);
  }

  public String toString(){
    return("Name: " + m_name + "\nAge: " + m_age + "\n---" + "\nDog\n" + m_dog);
  }
}
