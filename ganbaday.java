import java.util.Random;
import java.util.Scanner;
public class ganbaday{
  public static void main(String [] args){
    Random r=new Random();
    Scanner s=new Scanner(System.in);
    int count=1, answer=0, correct=0;

    System.out.println("線上測驗開始...");
    while(count<=5){
      int a=r.nextInt(9)+1;
      int b=r.nextInt(9)+1;
      System.out.printf("%d x %d = ?", a, b);
      answer = s.nextInt();
      s.close();
      if(a*b == answer){correct+=1;}
      count++;
  }
    if (correct>=4){System.out.println("數學資優生");}
    else if (correct<=3){System.out.println("要再加油!");}
  }
}