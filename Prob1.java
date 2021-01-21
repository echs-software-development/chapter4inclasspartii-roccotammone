import java.util.Scanner;

class Prob1 {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter a sentence: ");
  String firstword = scan.nextLine();
  System.out.println(firstword.indexOf(" "));
    
  }
}