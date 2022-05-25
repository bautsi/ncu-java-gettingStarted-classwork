public class UserClass1{
    public static void main(String [] args){
        Animal1 a=new Dog1();
        a.move();
        a=new Bird1();
        a.move();
        //a.layEgg(); //編譯錯誤 因非super不能DMB
    }
}
