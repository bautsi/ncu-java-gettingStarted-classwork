import java.util.Random;
import javax.swing.JOptionPane;
public class name{
    public static void main(String[]args){
        int input=JOptionPane.showConfirmDialog(null,"開始點名","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        Random r=new Random();
        String []b={"劉偉健","丁特","史丹利","青青","放火"};
        while(input==0){
            int a=r.nextInt(b.length);
            input=JOptionPane.showConfirmDialog(null,"點到了 "+ b[a] +"\n繼續點名嗎?","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        }
    }
}