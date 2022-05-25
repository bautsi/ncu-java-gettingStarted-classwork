public class Son extends Father{
    public void habit(){  //也會有habit這支method
        System.out.println("I love racing."); //把fishing隱藏
        super.habit(); //call super(Father)裡的habit
    }
}
