package io.genai.bankingapp.test;

import java.math.BigDecimal;

public class TransferService {

    public void transfer(BankAccount from, BankAccount to, BigDecimal amount) {
        validateAccounts(from, to);
        if (!from.hasSufficientFunds(amount)) {
            throw new IllegalStateException("Source account has insufficient funds");
        }
        from.withdraw(amount);
        to.deposit(amount);
    }

    public boolean canTransfer(BankAccount from, BankAccount to, BigDecimal amount) {
        if (from == null || to == null || amount == null) {
            return false;
        }
        if (from.equals(to)) {
            return false;
        }
        return from.hasSufficientFunds(amount);
    }

    private void validateAccounts(BankAccount from, BankAccount to) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Accounts must not be null");
        }
        if (from.equals(to)) {
            throw new IllegalArgumentException("Source and target accounts must be different");
        }
    }
}