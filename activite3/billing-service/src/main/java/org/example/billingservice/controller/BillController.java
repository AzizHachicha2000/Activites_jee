package org.example.billingservice.controller;

import org.example.billingservice.entities.Bill;

@RestController
@RequestMapping("/bills")
public class BillController {
    
    @GetMapping("/full/{id}")
    public Bill getFullBill(@PathVariable Long id) {
        Bill bill = billRepository.findById(id).get();
        bill.setCustomer(customerClient.getCustomer(bill.getCustomerId()));
        bill.getProductItems().forEach(item -> {
            item.setProduct(inventoryClient.getProduct(item.getProductId()));
        });
        return bill;
    }
}