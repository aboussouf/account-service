package com.yourbank.account.controller;

import com.yourbank.account.model.Account;
import com.yourbank.account.model.Money;
import com.yourbank.account.model.OperationType;
import com.yourbank.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/accounts/{account_id}/transactions/fees")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    Account handleOperation(@PathVariable("account_id") String accountId, @ModelAttribute String operationType, @ModelAttribute String amount) {
        return accountService.handleOperation(accountId, OperationType.valueOf(operationType), Money.anAmountOf(new BigDecimal(amount)));
    }

}
