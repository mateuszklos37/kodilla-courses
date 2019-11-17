package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product tomato = new Product("Tomato");
        Product onion = new Product("Onion");
        Product cheese = new Product("Cheese");
        Item tomatoItem = new Item(tomato, new BigDecimal("5.99"), 2, new BigDecimal("11.98"));
        Item onionItem = new Item(onion, new BigDecimal("4.55"), 1, new BigDecimal("4.55"));
        Item cheeseItem = new Item(cheese, new BigDecimal("10.99"), 2, new BigDecimal("21.98"));
        Invoice invoice = new Invoice("191119001");
        invoice.getItems().add(tomatoItem);
        invoice.getItems().add(cheeseItem);
        invoice.getItems().add(onionItem);
        cheeseItem.setInvoice(invoice);
        onionItem.setInvoice(invoice);
        tomatoItem.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        //invoiceDao.deleteById(id);
    }
}
