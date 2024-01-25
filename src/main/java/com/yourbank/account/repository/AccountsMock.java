package com.yourbank.account.repository;

import com.yourbank.account.model.Account;
import com.yourbank.account.model.Money;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountsMock {

    public static Account currentAccountById(final String id) {
        return Account.builder().accountId(id).balance(Money.anAmountOf(BigDecimal.ZERO)).build();
    }
}
