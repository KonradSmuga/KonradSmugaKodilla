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
    ProductDao productDao;

    @Autowired
    InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave() {
        Product product = new Product("Telephone");
        Product product1 = new Product("TV");
        Product product2 = new Product("PC");
        Product product3 = new Product("Camera");

        Item item = new Item(product, new BigDecimal(4000), 3, new BigDecimal(12000));
        Item item1 = new Item(product1, new BigDecimal(4000), 2, new BigDecimal(8000));
        Item item2 = new Item(product2, new BigDecimal(6000), 3, new BigDecimal(18000));
        Item item3 = new Item(product3, new BigDecimal(1200), 5, new BigDecimal(6000));

        product.getItems().add(item);
        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        Invoice invoice = new Invoice("1");

        //when
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        productDao.save(product);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        invoiceDao.save(invoice);
        //then
        Assert.assertNotEquals(0, invoice.getId());
        //CleanUp
        try {
            invoiceDao.delete(invoice);
        } catch (Exception e) {

        }
    }
}