public class March12Class{

  //prints hello world
  public static void main(String [] args){
    System.out.println();
    System.out.println(aMethod(2));
  }

  public static int aMethod(int n){
    int value = 1;
    for(int i = n; i >= 1; --i){
      value *= 1;
      System.out.println(value)
    }
    return value;
  }
}
