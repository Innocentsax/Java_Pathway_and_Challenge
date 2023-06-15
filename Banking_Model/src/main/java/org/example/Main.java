package org.example;

import org.example.Entity.User;
import org.example.Enum.Role;
import org.example.ServiceImpl.TransactionServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        User accessBankCustomer = new User(Role.CUSTOMER);
        User accessBankCashier = new User(Role.CASHIER);
        TransactionServiceImpl transactionService = new TransactionServiceImpl();
        transactionService.depositFunds(accessBankCashier, accessBankCustomer, new BigDecimal(10000));
    }
}