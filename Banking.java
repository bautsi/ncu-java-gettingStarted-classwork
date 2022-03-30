public class Banking {
    public static void main(String [] args){
        Account a1 = new Account();
        a1.setName("johny");
        a1.deposit(500);
        System.out.println("Hello "+a1.getName()+" your current balance: "+a1.getBalance());

    }
}
