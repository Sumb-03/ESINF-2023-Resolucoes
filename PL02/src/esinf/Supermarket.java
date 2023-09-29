/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

import java.time.LocalDate;
import java.util.*;

/**
 * @author DEI-ISEP
 */
public class Supermarket {
    Map<Invoice, Set<Product>> sup;

    Supermarket() {
        sup = new HashMap<>();
    }

    // Reads invoices from a list of String
    void getInvoices(List<String> l) throws Exception {
        Invoice currentInvoice = null;
        Set<Product> products = null;

        for (String line : l) {
            String[] parts = line.split(",");
            if (parts[0].equals("I")) {
                currentInvoice = new Invoice(parts[1], parts[2]);
                products = new HashSet<>();
                sup.put(currentInvoice, products);
            } else if (parts[0].equals("P")) {
                String identification = parts[1];
                int quantity = Integer.parseInt(parts[2]);
                int price = Integer.parseInt(parts[3]);
                products.add(new Product(identification, quantity, price));
            }


        }
    }

    // returns a set in which each number is the number of products in the r
    // invoice 
    Map<Invoice, Integer> numberOfProductsPerInvoice() {
        Map<Invoice, Integer> result = new HashMap<>();

        for (Invoice invoice: sup.keySet()) {
            result.put(invoice, sup.get(invoice).size());
        }

        return  result;
    }

    // returns a Set of invoices in which each date is >d1 and <d2
    Set<Invoice> betweenDates(LocalDate d1, LocalDate d2) {
        Set<Invoice> result = new HashSet<>();

        for (Invoice invoice: sup.keySet()) {
            if (invoice.getDate().isAfter(d1)  && invoice.getDate().isBefore(d2)) {
                result.add(invoice);
            }
        }

        return result;

    }

    // returns the sum of the price of the product in all the invoices
    long totalOfProduct(String productId) {
        int sumPrice = 0;
        for (Invoice invoice: sup.keySet()) {
            for (Product product: sup.get(invoice)) {
                if (product.getIdentification().equals(productId))
                    sumPrice += product.getPrice() * product.getQuantity();
            }
        }

        return sumPrice;
    }

    // converts a map of invoices and troducts to a map which key is a product 
    // identification and the values are a set of the invoices in which it appears
    Map<String, Set<Invoice>> convertInvoices() {
        Map<String, Set<Invoice>> result = new HashMap<>();

        for (Invoice invoice: sup.keySet()) {
            for (Product product: sup.get(invoice)) {
                if (result.containsKey(product.getIdentification())) {
                    result.get(product.getIdentification()).add(invoice);
                } else {
                    Set<Invoice> invoices = new HashSet<>();
                    invoices.add(invoice);
                    result.put(product.getIdentification(), invoices);
                }
            }
        }

        return result;
    }

}
