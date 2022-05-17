public class Supandsub{
    public static void main(String[]args){
        SuperA sa=new SuperA();
        SubB sb=new SubB();

        System.out.println(sb.getV1());

        sb.setV1("data from sub");  //使用服務方法

        System.out.println(sb.getV1());

        System.out.println(sa.getV1());
    }
}