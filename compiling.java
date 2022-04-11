public class compiling {

    public static void main(String[] args){
        Budget call = new Budget();
        System.out.println(call.amount);
        call.deposit(5);
        System.out.println(call.amount);
    }
}