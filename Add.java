import java.util.Scanner;
public class Add{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    double a,b,c;
    
    System.out.printf("Enter first double:");
    a=s.nextDouble();

    System.out.printf("Enter second double:");
    b=s.nextDouble();
    s.close();
    c=a+b;

    System.out.printf("The result is %.1f",c);
  }
}