public class Harmonic{
  public static double calcIterativeHarmonic(int n){
    double harmonicValue = 0.0;
    while(n != 1){
      harmonicValue += (1.0/n);
      n --;
    }
    return harmonicValue += 1.0;
  }

  public static double calcRecursiveHarmonic(int n){
    if(n == 1){
      return 1.0;
    }
    else{
      return (1.0/n) + calcRecursiveHarmonic(n-1);
    }
  }

  public static void main(String[]args){
    System.out.println("Harmonic numbers using iteration: ");
    for (int i = 1; i < 21; i ++){
      System.out.print(calcIterativeHarmonic(i) + " ");
    }
    System.out.println();
    System.out.println("Harmonic numbers using recursion: ");
    for (int r = 1; r < 21; r ++){
      System.out.print(calcRecursiveHarmonic(r) + " ");
    }
    System.out.println();
  }
}
