package org.example.Service;

import org.example.Entity.Transaction;
import org.example.Entity.User;

import java.math.BigDecimal;

public interface TransactionService {
    Transaction depositFunds (User cashier, User customer, BigDecimal cashDeposit);

    BigDecimal withdrawFunds (User cashier, User customer, BigDecimal cashDeposit);
}
