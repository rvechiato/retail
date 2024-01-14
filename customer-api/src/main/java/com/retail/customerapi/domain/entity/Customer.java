package com.retail.customerapi.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_customer")
public class Customer {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    private UUID uuid;
    private String identification_number;
    private String first_name;
    private String last_name;
    private String social_name;
    private LocalDate birth_date;
    private List<Address> addresses;
    private List<Phone> phones;
    private List<Email> emails;
    private List<Documents> documents;
    private List<payments> wallet;

}
