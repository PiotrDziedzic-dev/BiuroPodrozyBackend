package com.kodilla.biuro.controller;


import com.kodilla.biuro.domain.InvoiceDto;
import com.kodilla.biuro.domain.UserDto;
import com.kodilla.biuro.mapper.InvoiceMapper;
import com.kodilla.biuro.mapper.UserMapper;
import com.kodilla.biuro.service.InvoiceDatabaseFacade;
import com.kodilla.biuro.service.UserDatabaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Invoice")
@CrossOrigin("*")
public class InvoiceController {

    private final InvoiceMapper invoiceMapper;
    private final InvoiceDatabaseFacade invoiceDatabaseFacade;
    private final UserDatabaseFacade userDatabaseFacade;
    private final UserMapper userMapper;

    @Autowired
    public InvoiceController(InvoiceMapper invoiceMapper, InvoiceDatabaseFacade invoiceDatabaseFacade, UserDatabaseFacade userDatabaseFacade, UserMapper userMapper ) {
        this.invoiceDatabaseFacade = invoiceDatabaseFacade;
        this.invoiceMapper = invoiceMapper;
        this.userDatabaseFacade = userDatabaseFacade;
        this.userMapper = userMapper;

    }

    @RequestMapping(method = RequestMethod.GET, value = "getUserInvoices")
    public List<InvoiceDto> getUserInvoices(@RequestBody UserDto userDto) {
        return invoiceMapper.mapToInvoiceDtoList(invoiceDatabaseFacade.getUserInvoices(userMapper.mapToUser(userDto)));
    }
}
