package io.genai.bankingapp.test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;

import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions.*;

public class BankAccountGeneratedAiTests {

    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount(123456789, BigDecimal.ZERO);
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(new BigDecimal("100"));
        Assertions.assertEquals(new BigDecimal("100"), bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.deposit(new BigDecimal("100"));
        bankAccount.withdraw(new BigDecimal("50"));
        Assertions.assertEquals(new BigDecimal("50"), bankAccount.getBalance());
    }

    @Test
    void testInsufficientFunds() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(new BigDecimal("100"))); 
    }
}
