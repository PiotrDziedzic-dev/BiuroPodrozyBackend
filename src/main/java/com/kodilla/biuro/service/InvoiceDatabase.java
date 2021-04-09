package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Invoice;
import com.kodilla.biuro.domain.User;
import com.kodilla.biuro.repository.InvoiceRepossitory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceDatabase {

    @Autowired
    InvoiceRepossitory invoiceRepossitory;

    public List<Invoice> getAllInvoices() {
        return invoiceRepossitory.findAll();
    }

    public List<Invoice> getUserInvoices(User user) {
        return invoiceRepossitory.findInvoiceByUser(user);
    }

}
