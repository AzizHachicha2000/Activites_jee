package org.example.billingservice.feign;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerClient {
    @GetMapping("/customers/{id}")
    Customer getCustomer(@PathVariable Long id);
}
