package week01uniqueclasspractice;

public class MobileWallet {
    private String walletId;
    private String accountholder;
    private double balance;

    public MobileWallet(String walletId, String accountholder, double initialBalance) {
        this.walletId = walletId;
        this.accountholder = accountholder;
        this.balance = initialBalance;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public double getBalance() {
        return balance;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
