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

//方法設成private void ?時候不僅不能直接繼承，甚至不能用super.?來獲取