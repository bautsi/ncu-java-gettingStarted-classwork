import java.util.Random;
public class lotoo{
    public static void main(String [] args){
        Random r=new Random();
        int[]num=new int[6];
        for(int i=0;i<num.length;i++){
            num[i]=r.nextInt(42)+1;
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}