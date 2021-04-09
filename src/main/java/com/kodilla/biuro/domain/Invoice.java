package com.kodilla.biuro.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "INVOICES")
public class Invoice {


    @Id
    @GeneratedValue
    @NotNull
    @Column
    private Long invoiceId;

    @Column
    private User user;
    @Column
    private Boolean isPadid;
    @Column
    private Date dateOfTransaction;


}
