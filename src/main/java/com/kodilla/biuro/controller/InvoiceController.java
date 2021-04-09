package com.kodilla.biuro.controller;


import com.kodilla.biuro.domain.InvoiceDto;
import com.kodilla.biuro.domain.User;
import com.kodilla.biuro.domain.UserDto;
import com.kodilla.biuro.mapper.InvoiceMapper;
import com.kodilla.biuro.mapper.UserMapper;
import com.kodilla.biuro.service.InvoiceDatabase;
import com.kodilla.biuro.service.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Invoice")
@CrossOrigin("*")
public class InvoiceController {

    private final InvoiceMapper invoiceMapper;
    private final InvoiceDatabase invoiceDatabase;
    private final UserDatabase userDatabase;
    private final UserMapper userMapper;

    @Autowired
    public InvoiceController(InvoiceMapper invoiceMapper,InvoiceDatabase invoiceDatabase,UserDatabase userDatabase,UserMapper userMapper ) {
        this.invoiceDatabase = invoiceDatabase;
        this.invoiceMapper = invoiceMapper;
        this.userDatabase = userDatabase;
        this.userMapper = userMapper;

    }

    @RequestMapping(method = RequestMethod.GET, value = "getUserInvoices")
    public List<InvoiceDto> getUserInvoices(@RequestBody UserDto userDto) {
        return invoiceMapper.mapToInvoiceDtoList(invoiceDatabase.getUserInvoices(userMapper.mapToUser(userDto)));
    }
}
