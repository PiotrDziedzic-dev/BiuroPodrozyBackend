package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Invoice;
import com.kodilla.biuro.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepossitory extends CrudRepository<Invoice, Long> {

    @Override
    List<Invoice> findAll();

    List<Invoice> findInvoiceByUser(User user);
}
