public class Harmonic{
  //solve for harmonic number given an n term: using iteration
  public static double calcIterativeHarmonic(int n){
    //create double value, add to value to get sum
    double harmonicValue = 0.0;
    while(n != 1){ //while loop until n is first term of series
      harmonicValue += (1.0/n); //sum values using definition
      n --; //take a count away from n
    }
    return harmonicValue + 1.0; //return final value with last term added
  }

  //solve for harmonic number given an n term: using recursion
  public static double calcRecursiveHarmonic(int n){
    //base case
    if(n == 1){
      return 1.0; //base case is first term of harmonic
    }
    else{
      //recursively add harmonic terms using definition until base case is hit
      return (1.0/n) + calcRecursiveHarmonic(n-1);
    }
  }

  public static void main(String[]args){
    //use for loop to collectively print all harmonic numbers up to a value n

    //iteration is used here
    System.out.println("Harmonic numbers using iteration: ");
    for (int i = 1; i < 21; i ++){ //n here is 20
      System.out.print(calcIterativeHarmonic(i) + " ");
    }
    System.out.println();

    //recursion is used here
    System.out.println("Harmonic numbers using recursion: ");
    for (int r = 1; r < 21; r ++){ //n here is 20
      System.out.print(calcRecursiveHarmonic(r) + " ");
    }
    System.out.println();
  }
}
