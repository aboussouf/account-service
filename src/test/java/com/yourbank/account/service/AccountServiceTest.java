package com.yourbank.account.service;

import com.yourbank.account.model.Account;
import com.yourbank.account.model.OperationType;
import com.yourbank.account.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static com.yourbank.account.model.Account.anInitialAccount;
import static com.yourbank.account.model.Money.anAmountOf;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @InjectMocks
    private AccountService accountService;

    @Mock
    private AccountRepository accountRepository;

    @Test
    void should_increaseBalance_when_deposit_given_positifAmount() throws Exception {
        // Given
        Account account= anInitialAccount();

        // When
        Account result = accountService.handleOperation(OperationType.DEPOSIT, anAmountOf(new BigDecimal("10.0")));

        // Then
        assertThat(result.getBalance().getAmount()).isEqualTo(new BigDecimal("10.0"));

    }
}
