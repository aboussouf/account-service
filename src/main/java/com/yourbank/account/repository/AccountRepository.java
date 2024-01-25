package com.yourbank.account.repository;

import com.yourbank.account.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    public Account getAccountById(String id) {
        return AccountsMock.currentAccountById(id);
    }
}
