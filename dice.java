package game;
import java.util.*;
public class dice {
    public int roll(){
        Random r = new Random();
        return 1 + r.nextInt(6);
    }
}
