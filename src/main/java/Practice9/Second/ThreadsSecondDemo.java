package Practice9.Second;

public class ThreadsSecondDemo {
    public static void main(String[] args){
        final Bank bank = new Bank();
        Thread thread1 = new Thread(new Thread1(bank));
        Thread thread2 = new Thread(new Thread2(bank));

        thread1.start();
        thread2.start();
    }
}
