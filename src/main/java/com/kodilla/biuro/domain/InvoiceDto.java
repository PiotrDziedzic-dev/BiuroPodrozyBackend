package com.kodilla.biuro.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDto {

    private Long invoiceId;
    private User user;
    private Boolean isPadid;
    private Date dateOfTransaction;
}