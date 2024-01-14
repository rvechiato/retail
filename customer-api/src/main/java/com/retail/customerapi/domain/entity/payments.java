package com.retail.customerapi.domain.entity;

import com.retail.customerapi.domain.entity.enums.CardType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_card_payments")
public class payments {
    //TODO Verify name class and types, check the privice of data
    private UUID  uuid;
    private CardType cardType;
    private String owner_name;
    private String number;
    private String verification;
    private String Expire_date;
    private boolean principal;
}
