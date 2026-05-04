package io.genai.bankingapp.test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;


public class TransferServiceGeneratedAiTests {

    @InjectMocks
    private TransferService transferService;

    @Mock
    private AccountRepository accountRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testTransferSuccess() {
        // Arrange
        Account sourceAccount = new Account("123", BigDecimal.valueOf(1000));
        Account destinationAccount = new Account("456", BigDecimal.valueOf(0));
        BigDecimal amount = BigDecimal.valueOf(500);

        when(accountRepository.findById("123")).thenReturn(java.util.Optional.of(sourceAccount));
        when(accountRepository.findById("456")).thenReturn(java.util.Optional.of(destinationAccount));

        // Act
        transferService.transfer(amount, "123", "456");

        // Assert
        assertThat(sourceAccount.getBalance()).isEqualTo(BigDecimal.valueOf(500));
        assertThat(destinationAccount.getBalance()).isEqualTo(BigDecimal.valueOf(500));
    }

    @Test
    void testTransferInsufficientFunds() {
        // Arrange
        Account sourceAccount = new Account("123", BigDecimal.valueOf(100));
        Account destinationAccount = new Account("456", BigDecimal.valueOf(0));
        BigDecimal amount = BigDecimal.valueOf(200);

        when(accountRepository.findById("123")).thenReturn(java.util.Optional.of(sourceAccount));
        when(accountRepository.findById("456")).thenReturn(java.util.Optional.of(destinationAccount));

        // Act
        // Assert
        assertThrows(InsufficientFundsException.class, () -> transferService.transfer(amount, "123", "456"));
    }


}