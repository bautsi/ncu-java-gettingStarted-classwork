import java.util.Scanner;
public class Scannerstop{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int response=0, votes=0, r1=0, r2=0, r3=0;
    while(response!=-1){
    System.out.print("票選最喜歡的台灣小吃：(1)臭豆腐(2)蚵ㄚ煎(3)滷味。若結束時請輸入-1。請選擇 : \n");
    response=input.nextInt();
    if(response==1){r1++;}
    else if(response==2){r2++;}
    else if(response==3){r3++;}
    if(response!=-1){votes++;}}
    input.close();
    if(votes!=0){
    System.out.printf("票選結果 : \n(1)臭豆腐 : %d 得票率 : %d%%\n(2)蚵ㄚ煎 : %d 得票率 : %d%%\n(3)滷  味 : %d 得票率 : %d%%\n",r1, (100*r1)/votes,r2, (100*r2)/votes,r3, (100*r3)/votes);}
    else{System.out.println("無任何投票");}
}
}