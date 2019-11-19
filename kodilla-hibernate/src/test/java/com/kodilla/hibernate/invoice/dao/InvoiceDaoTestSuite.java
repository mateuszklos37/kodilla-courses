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
        Product cheese = new Product("Cheese");
        Product onion = new Product("Onion");
        Item cheeseItem = new Item(new BigDecimal("14.99"), 2, new BigDecimal("29.98"));
        cheeseItem.setProduct(cheese);
        Item onionItem = new Item(new BigDecimal("3.99"), 3, new BigDecimal("11.97"));
        onionItem.setProduct(onion);
        Item tomatoItem = new Item(new BigDecimal("5"), 5, new BigDecimal("25"));
        tomatoItem.setProduct(tomato);
        Invoice invoice = new Invoice("1911001");
        invoice.getItems().add(cheeseItem);
        invoice.getItems().add(onionItem);
        invoice.getItems().add(tomatoItem);
        cheeseItem.setInvoice(invoice);
        onionItem.setInvoice(invoice);
        tomatoItem.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertTrue(invoiceDao.findById(id).isPresent());
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
