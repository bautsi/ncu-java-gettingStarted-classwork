import java.util.Random;
import java.util.Scanner;
public class foree
{
  public static void main( String [] args )
  {
    Random r=new Random();
    Scanner s=new Scanner(System.in);
    int answer=0, correct=0;
    System.out.println("線上測驗開始(共五題)...");
    for(int i=1;i<=5;i++)
    {
       int a=r.nextInt(9)+1;
       int b=r.nextInt(9)+1;
       System.out.printf("%d x %d = ?", a, b);
       answer = s.nextInt();
       s.close();
       if(answer==a*b)
       {
         correct++;
       }
    }
   if( correct>=4){System.out.println("數學資優生喔");}
   else{System.out.println("要再加油喔!");}
   }
} 