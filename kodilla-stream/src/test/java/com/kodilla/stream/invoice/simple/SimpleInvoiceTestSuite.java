package com.kodilla.stream.invoice.simple;
import org.junit.Assert;
import org.junit.Test;
import sun.java2d.pipe.SpanShapeRenderer;

public class SimpleInvoiceTestSuite {
    @Test
    public void testValueToPay(){
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));
        //Then
        Assert.assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }

}
