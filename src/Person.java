/**
 * This is a class representing the behavior of a Person.
 * @author Student
 * @version 1.0
 */
public class Person {


    private Wallet wallet;


    public Person(int initialAmount) {
        this.wallet = new Wallet(initialAmount);
    }


    public int calcTotal(int[] bills) {
        int total = 0;
        for (int bill : bills) {
            total += bill;
        }
        return total;
    }


    public boolean payMoney(int total) {
        if (wallet.acceptMoney(total)) {
            wallet.setMoneyAmount(wallet.getAmount() - total);
            return true;
        } else {
            return false;
        }
    }


    public Wallet getWallet() {
        return wallet;
    }


    public class Wallet {

        private int amount;


        public Wallet(int initialAmount) {
            this.amount = initialAmount;
        }


        public boolean setMoneyAmount(int amount) {
            if (amount >= 0) {
                this.amount = amount;
                return true;
            } else {
                return false;
            }
        }


        public boolean acceptMoney(int amount) {
            return this.amount >= amount;
        }


        public int getAmount() {
            return this.amount;
        }
    }
}
