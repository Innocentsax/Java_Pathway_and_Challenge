package org.example.Entity;

import org.example.Enum.TrascationType;

import java.math.BigDecimal;

public class Transaction {
    private BigDecimal amount;
    private TrascationType trascationType;
    private String customer;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TrascationType getTrascationType() {
        return trascationType;
    }

    public void setTrascationType(TrascationType trascationType) {
        this.trascationType = trascationType;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
