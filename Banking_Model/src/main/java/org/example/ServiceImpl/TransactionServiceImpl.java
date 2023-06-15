package org.example.ServiceImpl;

import org.example.Entity.Transaction;
import org.example.Entity.User;
import org.example.Service.TransactionService;

import java.math.BigDecimal;

public class TransactionServiceImpl implements TransactionService {
    @Override
    public Transaction depositFunds(User cashier, User customer, BigDecimal cashDeposit) {
        //Check customer if they are our customer
        //Check if cashDeposit within transaction limit
        //Deposit to account
        //Update Account Detail
        //Create transaction object
        //Storing transaction object
        //Returning transaction object
        return null;
    }

    @Override
    public BigDecimal withdrawFunds(User cashier, User customer, BigDecimal expectedCash) {
        //Check customer if they exist in our system
        //Check withdrawal limit against expectation
        //Withdraw funds from account Details
        //Update accountDetail balance
        //Storing transaction object
        //return funds
        //return transaction Update
        return null;
    }
}
