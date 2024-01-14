package com.retail.customerapi.domain.entity.enums;

public enum CardType {
    CREDIT(1,"Credito"),
    DEBIT(2, "Debito");

    private int type;
    private String description;

    CardType(int type, String description) {
        this.type = type;
        this.description = description;
    }
}
