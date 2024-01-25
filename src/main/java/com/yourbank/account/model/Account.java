package com.yourbank.account.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

import static com.yourbank.account.model.Money.anAmountOf;

@Getter
@Builder
public class Account {
    private String accountId;
    private Money balance;

    public Account(String accountId, Money balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public static Account anInitialAccount() {
        return new Account("123456L", anAmountOf(BigDecimal.ZERO));
    }

    public void add(Money money) {
        this.balance.add(money);
    }
}
