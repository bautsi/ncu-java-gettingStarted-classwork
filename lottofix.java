import java.util.Random;
public class lottofix{
    public static void main(String [] args){
        Random r=new Random();
        int[]num=new int[6];
        do{
            for(int i=0;i<num.length;i++){
                num[i]=r.nextInt(42)+1;
            }
        }while(num[0]==num[1]||num[0]==num[2]||num[0]==num[3]||num[0]==num[4]||num[0]==num[5]||num[1]==num[2]||num[1]==num[3]||num[1]==num[4]||num[1]==num[5]||num[2]==num[3]||num[2]==num[4]||num[2]==num[5]||num[3]==num[4]||num[3]==num[5]||num[4]==num[5]);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}