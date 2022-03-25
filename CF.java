import java.util.Scanner;
public class CF{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    double a,b;

    System.out.print("請輸入攝氏溫度值(小數後一位):");
    a=s.nextDouble();
    s.close();
    
    b=a*9/5+32;

    System.out.printf("所輸入的攝氏溫度%.1f度是華氏溫度%.1f度",a,b);
  }
}