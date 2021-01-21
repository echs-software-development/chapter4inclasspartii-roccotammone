import java.util.Scanner;

class Prob2 {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter a string: ");
  String banana = scan.nextLine();
  System.out.println(banana.substring(0,1));
  System.out.println(banana.substring(banana.length()-1));


    
  }
}