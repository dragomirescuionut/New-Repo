package session11_abstraction.challenge.abstract_bank;

public class BankC extends Bank {
    @Override
    public void getBalance() {
        System.out.println("The balance is: $200");
    }
}