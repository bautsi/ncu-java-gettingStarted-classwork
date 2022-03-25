import java.util.Scanner;
public class star{
  public static void main(String[]args){
    int row;
    Scanner input=new Scanner(System.in);
    System.out.print("請問要印幾列的三角形星星?");
    row=input.nextInt();
    input.close();
    for(int i=1;i<=row;i++){
      for(int k=1;k<=i;k++){
         System.out.print("*");}
      System.out.print("\n");}}} 