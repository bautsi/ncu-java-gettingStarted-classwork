public class UserClass{
    public static void main(String [] args){
        Animal a=new Dog();
        a.move();
        a=new Bird();
        a.move();
        a.layEgg(); //編譯錯誤 因非super不能DMB
    }
}
