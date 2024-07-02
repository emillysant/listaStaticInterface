import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
    private static List<BankAccount> accounts = new ArrayList<>();

    public static void openAccount(BankAccount account) {
        accounts.add(account);
    }

    public static boolean deposit(String accountNumber, double amount) {
        Optional<BankAccount> account = findAccount(accountNumber);
        if (account.isPresent() && amount > 0) {
            account.get().deposit(amount);
            return true;
        }
        return false;
    }

    public static boolean withdraw(String accountNumber, double amount) {
        Optional<BankAccount> account = findAccount(accountNumber);
        return account.isPresent() && account.get().withdraw(amount);
    }

    private static Optional<BankAccount> findAccount(String accountNumber) {
        return accounts.stream().filter(account -> account.getAccountNumber().equals(accountNumber)).findFirst();
    }

    public static List<BankAccount> listAccounts() {
        return new ArrayList<>(accounts);
    }
}
