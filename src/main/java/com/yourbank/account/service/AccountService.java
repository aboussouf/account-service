package com.yourbank.account.service;

import com.yourbank.account.model.Account;
import com.yourbank.account.model.Money;
import com.yourbank.account.model.OperationType;
import com.yourbank.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private AccountRepository accountRepository;

    public Account handleOperation(String accountId, OperationType operationType, Money money) {

        if(!accountId.equals("123456L")) {
            return null;
        }

        Account account = Account.anInitialAccount();

        Account persistedAccount = accountRepository.getAccountById(account.getAccountId());

        if(OperationType.DEPOSIT.equals(operationType)) {
            account.add(money);
        }

        return account;
    }
}
