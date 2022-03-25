import java.util.Scanner;
public class Vote{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.print("貴姓大名:");
    String name = s.nextLine();
    int response;
    String reply="";
    System.out.print("票選最喜歡的台灣小吃：(1)臭豆腐(2)蚵ㄚ煎(3)滷味\n");
    response = s.nextInt();
    s.close();
    if(response==1){reply="臭豆腐";}
    else if(response==2){reply="蚵ㄚ煎";}
    else if(response==3){reply="滷味";}
    System.out.printf("%s選%s",name, reply);
  }
}