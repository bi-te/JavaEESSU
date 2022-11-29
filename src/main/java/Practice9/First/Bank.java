package Practice9.First;

public class Bank {
    private int account;

    public Bank() {
        this.account = 2;
    }

    public synchronized void inc(){
        for (int i = 0; i < 20000; i++) {
            account += 2;
        }
        System.out.println("increment res: " + account);
    }

    public synchronized void dec(){
        for (int i = 0; i < 20000; i++) {
            account--;
        }
        System.out.println("decrement res: " + account);
    }
}
