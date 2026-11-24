package week01uniqueclasspractice;

public class Main {
    public static void main(String[] args) {
        MobileWallet wallet = new MobileWallet("123", "John Doe", 1000.0);
        System.out.println("Wallet ID: " + wallet.getWalletId());
        System.out.println("Account Holder: " + wallet.getAccountholder());
        System.out.println("Balance: " + wallet.getBalance());
    }
}
