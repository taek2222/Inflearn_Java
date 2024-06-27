package problem2;

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(balance < amount) System.out.println("잔액 부족");
        else balance -= amount;
    }

    public void printBalance() {
        System.out.println("잔고: " + balance);
    }
}
