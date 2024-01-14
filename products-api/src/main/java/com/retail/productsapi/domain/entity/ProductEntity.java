package com.retail.productsapi.domain.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductEntity implements Serializable {
    private static final long serialVersoinUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cod_cli_idef;

    private String name;
    private BigDecimal value;

    public UUID getCod_cli_idef() {
        return cod_cli_idef;
    }

    public void setCod_cli_idef(UUID cod_cli_idef) {
        this.cod_cli_idef = cod_cli_idef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
