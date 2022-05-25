public class UserClass {
    public static void main(String [] args){
        C c=new A();
        //c=new　B(); //B是抽象的 不能把它變成物件
        c.ma(); //A沒有ma 但可以去找阿公C
        c.mb();
        //c.mc(); //C沒有mc(super) 不能DMB
    }
}
