package com.yourbank.account.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
public class Money {
    private BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public static Money anAmountOf(BigDecimal amount) {
        return new Money(amount);
    }

    public void add(Money money) {
        amount = amount.add(money.getAmount());
    }
}
