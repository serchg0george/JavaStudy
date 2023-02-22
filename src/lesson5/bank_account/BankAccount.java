package lesson5.bank_account;

public class BankAccount {

    double replenishmentBankAccount(double startIncreaseBalance, double increaseBalance) {
        double resultOfReplenishment;
        resultOfReplenishment = startIncreaseBalance + increaseBalance;
        return resultOfReplenishment;
    }

    double withdrawBankAccount(double startWithdrawBalance, double withdrawBalance) {
        double resultOfWithdraw;
        resultOfWithdraw = startWithdrawBalance - withdrawBalance;
        return resultOfWithdraw;
    }

}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccountIncrease = new BankAccount();
        double replenishmentMoney = bankAccountIncrease.replenishmentBankAccount(15,25);
        System.out.println("Result of replenishment: " + replenishmentMoney);

        BankAccount bankAccountWithdraw = new BankAccount();
        double withdrawMoney = bankAccountWithdraw.withdrawBankAccount(25,10);
        System.out.println("Result of withdraw: " + withdrawMoney);
    }
}

