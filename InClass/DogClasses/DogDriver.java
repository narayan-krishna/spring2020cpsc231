public class DogDriver{
  public static void main(String[] args) {
    Dog d1 = new Dog("Sydney", "lab", 5, 'F');
    Owner o1 = new Owner("Laura", 28, d1);
    System.out.println(o1);
    System.out.println();
    Owner o2 = new Owner(o1);
    o2.setName("Liza");
    o2.changeDogName("Frankie");
    System.out.println(o2);
    System.out.println();
    System.out.println(o1);
  }
}
