package Practice9.Second;

public class Thread1 implements Runnable {
    private final Bank bank;

    public Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        {
            for (int i = 0; i < 20000; i++) {
                bank.setAccount(bank.getAccount() + 2);
            }
            System.out.println("increment res: " + bank.getAccount());
        }
    }
}
