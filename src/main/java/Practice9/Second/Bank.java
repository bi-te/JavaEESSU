package Practice9.Second;

public class Bank {
    private int account;

    public Bank() {
        this.account = 2;
    }

    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }

    public synchronized void inc(){
        for (; account < 20000; account += 2) {
            System.out.println("+ " + account);
        }
    }

    public synchronized void dec(){
        for (; account > 1; account--) {
            System.out.println("- " + account);
        }
    }
}
