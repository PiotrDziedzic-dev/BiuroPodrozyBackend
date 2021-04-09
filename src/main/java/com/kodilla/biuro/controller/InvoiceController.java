package com.kodilla.biuro.controller;


import com.kodilla.biuro.domain.InvoiceDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Invoice")
@CrossOrigin("*")
public class InvoiceController {

    @RequestMapping(method = RequestMethod.GET, value = "getUserInvoices")
    public List<InvoiceDto> getUserInvoices(@RequestParam Long userId) {
        return
    }
}
