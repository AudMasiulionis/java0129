package lesson14;

import java.util.ArrayList;
import java.util.Arrays;

public class ATM {
    private int balance = 1000;
    private boolean pinCodeValid;
    private final int PIN = 1234;
    private final int TRANSACTION_FEE = 1;
    private ArrayList<String> transactions = new ArrayList<>();

    public boolean isPinCodeValid() {
        return pinCodeValid;
    }

    public void enterPin(int pin){
        if (pin == PIN){
            this.pinCodeValid = true;
        }
    }

    public int showBalance() throws Exception {
        this.validatePin();
        return balance;
    }

    public void addMoney(int value) throws Exception {
        this.validatePin();
        this.validateValue(value);
        this.balance += value;
        transactions.add(String.format("Added to balance %d", value));
    }

    public void withdrawMoney(int value) throws Exception {
        this.validatePin();
        validateValue(value);
        if (value > this.balance){
            throw new Exception("Not enough money!");
        }
        this.balance -= value;
        this.balance -= TRANSACTION_FEE;
        transactions.add(String.format("Withdrawn from balance %d, fee applied %d", value, TRANSACTION_FEE));
    }

    public void close(){
        this.pinCodeValid = false;
    }

    private void validatePin() throws Exception {
        if (!this.pinCodeValid){
            throw new Exception("PIN not entered");
        }
    }

    private void validateValue(int value) throws Exception {
        if (value <= 0) {
            throw new Exception("Invalid value!");
        }
    }

    @Override
    public String toString() {
        if (this.pinCodeValid){
            return "";
        }
        return Arrays.toString(transactions.toArray());
    }
}
