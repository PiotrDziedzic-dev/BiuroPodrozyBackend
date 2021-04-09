package com.kodilla.biuro.mapper;

import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.domain.BoatDto;
import com.kodilla.biuro.domain.Invoice;
import com.kodilla.biuro.domain.InvoiceDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceMapper {
    UserMapper userMapper;

    public InvoiceDto mapToInvoiceDto(final Invoice invoice) {
        return new InvoiceDto(
            invoice.getInvoiceId(),
            userMapper.mapToUserDto(invoice.getUser()),
            invoice.getIsPadid(),
            invoice.getDateOfTransaction()
        );
    }

    public Invoice mapToInvoice(final InvoiceDto invoiceDto) {
        return new Invoice (
                invoiceDto.getInvoiceId(),
                userMapper.mapToUser(invoiceDto.getUserDto()),
                invoiceDto.getIsPadid(),
                invoiceDto.getDateOfTransaction()

        );
    }

    public List<InvoiceDto> mapToInvoiceDtoList(final List<Invoice> invoiceList) {
        return invoiceList.stream()
                .map(this::mapToInvoiceDto)
                .collect(Collectors.toList());
    }
}
